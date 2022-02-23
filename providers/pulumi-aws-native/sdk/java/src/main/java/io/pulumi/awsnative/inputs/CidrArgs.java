// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class CidrArgs extends io.pulumi.resources.InvokeArgs {

    public static final CidrArgs Empty = new CidrArgs();

    @InputImport(name="cidrBits", required=true)
      private final Integer cidrBits;

    public Integer getCidrBits() {
        return this.cidrBits;
    }

    @InputImport(name="count", required=true)
      private final Integer count;

    public Integer getCount() {
        return this.count;
    }

    @InputImport(name="ipBlock", required=true)
      private final String ipBlock;

    public String getIpBlock() {
        return this.ipBlock;
    }

    public CidrArgs(
        Integer cidrBits,
        Integer count,
        String ipBlock) {
        this.cidrBits = Objects.requireNonNull(cidrBits, "expected parameter 'cidrBits' to be non-null");
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.ipBlock = Objects.requireNonNull(ipBlock, "expected parameter 'ipBlock' to be non-null");
    }

    private CidrArgs() {
        this.cidrBits = null;
        this.count = null;
        this.ipBlock = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CidrArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer cidrBits;
        private Integer count;
        private String ipBlock;

        public Builder() {
    	      // Empty
        }

        public Builder(CidrArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBits = defaults.cidrBits;
    	      this.count = defaults.count;
    	      this.ipBlock = defaults.ipBlock;
        }

        public Builder setCidrBits(Integer cidrBits) {
            this.cidrBits = Objects.requireNonNull(cidrBits);
            return this;
        }

        public Builder setCount(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder setIpBlock(String ipBlock) {
            this.ipBlock = Objects.requireNonNull(ipBlock);
            return this;
        }
        public CidrArgs build() {
            return new CidrArgs(cidrBits, count, ipBlock);
        }
    }
}
