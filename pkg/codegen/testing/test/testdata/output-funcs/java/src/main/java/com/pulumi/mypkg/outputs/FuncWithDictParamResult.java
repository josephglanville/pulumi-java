// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mypkg.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FuncWithDictParamResult {
    private String r;

    private FuncWithDictParamResult() {}
    public String r() {
        return this.r;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FuncWithDictParamResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String r;
        public Builder() {}
        public Builder(FuncWithDictParamResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.r = defaults.r;
        }

        @CustomType.Setter
        public Builder r(String r) {
            this.r = r;
            return this;
        }
        public FuncWithDictParamResult build() {
            final var o = new FuncWithDictParamResult();
            o.r = r;
            return o;
        }
    }
}
