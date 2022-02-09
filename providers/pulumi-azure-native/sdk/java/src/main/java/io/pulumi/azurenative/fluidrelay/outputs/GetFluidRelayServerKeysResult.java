// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.fluidrelay.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetFluidRelayServerKeysResult {
    private final String key1;
    private final String key2;

    @OutputCustomType.Constructor({"key1","key2"})
    private GetFluidRelayServerKeysResult(
        String key1,
        String key2) {
        this.key1 = Objects.requireNonNull(key1);
        this.key2 = Objects.requireNonNull(key2);
    }

    public String getKey1() {
        return this.key1;
    }
    public String getKey2() {
        return this.key2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFluidRelayServerKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key1;
        private String key2;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFluidRelayServerKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key1 = defaults.key1;
    	      this.key2 = defaults.key2;
        }

        public Builder setKey1(String key1) {
            this.key1 = Objects.requireNonNull(key1);
            return this;
        }

        public Builder setKey2(String key2) {
            this.key2 = Objects.requireNonNull(key2);
            return this;
        }

        public GetFluidRelayServerKeysResult build() {
            return new GetFluidRelayServerKeysResult(key1, key2);
        }
    }
}
