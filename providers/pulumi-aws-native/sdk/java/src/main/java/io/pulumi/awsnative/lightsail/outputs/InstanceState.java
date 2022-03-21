// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceState {
    /**
     * Status code of the Instance.
     * 
     */
    private final @Nullable Integer code;
    /**
     * Status code of the Instance.
     * 
     */
    private final @Nullable String name;

    @CustomType.Constructor
    private InstanceState(
        @CustomType.Parameter("code") @Nullable Integer code,
        @CustomType.Parameter("name") @Nullable String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * Status code of the Instance.
     * 
    */
    public Optional<Integer> getCode() {
        return Optional.ofNullable(this.code);
    }
    /**
     * Status code of the Instance.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer code;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.name = defaults.name;
        }

        public Builder code(@Nullable Integer code) {
            this.code = code;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public InstanceState build() {
            return new InstanceState(code, name);
        }
    }
}
