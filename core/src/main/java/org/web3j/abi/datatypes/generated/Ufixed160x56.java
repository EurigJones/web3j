package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Ufixed;

/**
 * Auto generated code.
 * <p><strong>Do not modifiy!</strong>
 * <p>Please use org.web3j.codegen.AbiTypesGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class Ufixed160x56 extends Ufixed {
    public static final Ufixed160x56 DEFAULT = new Ufixed160x56(BigInteger.ZERO);

    public Ufixed160x56(BigInteger value) {
        super(160, 56, value);
    }

    public Ufixed160x56(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
        super(160, 56, m, n);
    }
}
