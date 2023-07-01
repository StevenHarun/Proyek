import pandas as pd
import sklearn.model_selection as ms
import sklearn.linear_model as lm
import matplotlib.pyplot as plt
import numpy as np


df1 = pd.read_csv('bensin.csv')
liter = df1[['Liter']]
kilometer = df1[['Kilometer']]
X_train,X_test,y_train,y_test = ms.train_test_split(liter,kilometer,test_size = 0.2,random_state=0)
print(X_train.size, X_test.size)

plt.scatter(X_train,y_train, edgecolors = 'r')
plt.xlabel("Liter")
plt.ylabel('Kilometer')
plt.title("konsumsi bahan bakar")
x1 = np.linspace(0,45)
y1 = 10.64+6.45*x1

#plt.grid(True)
plt.plot(x1,y1)
plt.show()