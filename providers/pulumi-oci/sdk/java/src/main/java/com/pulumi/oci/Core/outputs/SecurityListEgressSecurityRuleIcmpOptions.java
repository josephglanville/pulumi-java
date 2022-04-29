// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecurityListEgressSecurityRuleIcmpOptions {
    /**
     * @return (Updatable) The ICMP code (optional).
     * 
     */
    private final @Nullable Integer code;
    /**
     * @return (Updatable) The ICMP type.
     * 
     */
    private final Integer type;

    @CustomType.Constructor
    private SecurityListEgressSecurityRuleIcmpOptions(
        @CustomType.Parameter("code") @Nullable Integer code,
        @CustomType.Parameter("type") Integer type) {
        this.code = code;
        this.type = type;
    }

    /**
     * @return (Updatable) The ICMP code (optional).
     * 
     */
    public Optional<Integer> code() {
        return Optional.ofNullable(this.code);
    }
    /**
     * @return (Updatable) The ICMP type.
     * 
     */
    public Integer type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityListEgressSecurityRuleIcmpOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer code;
        private Integer type;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityListEgressSecurityRuleIcmpOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.type = defaults.type;
        }

        public Builder code(@Nullable Integer code) {
            this.code = code;
            return this;
        }
        public Builder type(Integer type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public SecurityListEgressSecurityRuleIcmpOptions build() {
            return new SecurityListEgressSecurityRuleIcmpOptions(code, type);
        }
    }
}
