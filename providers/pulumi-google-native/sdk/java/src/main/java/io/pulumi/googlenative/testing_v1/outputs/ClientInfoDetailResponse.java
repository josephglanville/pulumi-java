// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ClientInfoDetailResponse {
    /**
     * The key of detailed client information.
     * 
     */
    private final String key;
    /**
     * The value of detailed client information.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private ClientInfoDetailResponse(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("value") String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * The key of detailed client information.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * The value of detailed client information.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientInfoDetailResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientInfoDetailResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public ClientInfoDetailResponse build() {
            return new ClientInfoDetailResponse(key, value);
        }
    }
}
