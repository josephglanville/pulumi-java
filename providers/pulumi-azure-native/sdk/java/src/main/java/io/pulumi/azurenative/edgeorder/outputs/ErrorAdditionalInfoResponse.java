// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ErrorAdditionalInfoResponse {
    /**
     * The additional info.
     * 
     */
    private final Object info;
    /**
     * The additional info type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ErrorAdditionalInfoResponse(
        @CustomType.Parameter("info") Object info,
        @CustomType.Parameter("type") String type) {
        this.info = info;
        this.type = type;
    }

    /**
     * The additional info.
     * 
    */
    public Object getInfo() {
        return this.info;
    }
    /**
     * The additional info type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorAdditionalInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object info;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ErrorAdditionalInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.info = defaults.info;
    	      this.type = defaults.type;
        }

        public Builder info(Object info) {
            this.info = Objects.requireNonNull(info);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ErrorAdditionalInfoResponse build() {
            return new ErrorAdditionalInfoResponse(info, type);
        }
    }
}
