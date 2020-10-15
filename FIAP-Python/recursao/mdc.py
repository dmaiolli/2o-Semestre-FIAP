def mdc(a, b):
    resto = a % b
    if resto == 0:
        return b
    else:
        return mdc(b, resto)

print("MDC = ", mdc(24, 15))


