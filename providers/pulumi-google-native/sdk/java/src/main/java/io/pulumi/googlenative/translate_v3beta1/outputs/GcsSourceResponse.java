// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.translate_v3beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GcsSourceResponse {
    /**
     * Source data URI. For example, `gs://my_bucket/my_object`.
     * 
     */
    private final String inputUri;

    @CustomType.Constructor
    private GcsSourceResponse(@CustomType.Parameter("inputUri") String inputUri) {
        this.inputUri = inputUri;
    }

    /**
     * Source data URI. For example, `gs://my_bucket/my_object`.
     * 
    */
    public String getInputUri() {
        return this.inputUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcsSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String inputUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GcsSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputUri = defaults.inputUri;
        }

        public Builder inputUri(String inputUri) {
            this.inputUri = Objects.requireNonNull(inputUri);
            return this;
        }        public GcsSourceResponse build() {
            return new GcsSourceResponse(inputUri);
        }
    }
}
