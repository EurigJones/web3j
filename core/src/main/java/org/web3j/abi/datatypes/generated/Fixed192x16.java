package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Fixed;

/**
 * Auto generated code.
 * <p><strong>Do not modifiy!</strong>
 * <p>Please use org.web3j.codegen.AbiTypesGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class Fixed192x16 extends Fixed {
    public static final Fixed192x16 DEFAULT = new Fixed192x16(BigInteger.ZERO);

    public Fixed192x16(BigInteger value) {
        super(192, 16, value);
    }

    public Fixed192x16(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
        super(192, 16, m, n);
    }
}
