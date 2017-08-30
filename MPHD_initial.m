clc;
clear all;
close all;

%% �źŲ���
N = 200;
n = 1:1:N;
K = floor((N-1)/5);

A = sqrt(2);
phiA = 0 * pi;
w = 0.3 * pi;
sn = A * cos(w * n + phiA);

SNR = 20;
T = 100;
wAcu = w * ones(1,T);             %��ʵ���ź�
for t = 1:T
    xn = awgn(sn,SNR);
    %% MPHD�����Ĳ���
    k = 1;
    MPHD_R1 = real(A_MPHD(xn,N,k));
    MPHD_R2 = real(B_MPHD(xn,N,k));
   
    argumentc = (MPHD_R2+sqrt(MPHD_R2^2+8*MPHD_R1^2))/(4*MPHD_R1); 
    if (argumentc<-1)
        display('-1')
        argumentc = -1;
    end
    if (argumentc>1)
        display('1')
        argumentc = 1;
     end
      MPHD_gu(t) = acos(argumentc);
end
MSE_MPHD = 10*log10(mse(wAcu, MPHD_gu))
