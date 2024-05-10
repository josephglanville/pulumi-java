// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2_getAmi.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAmiResult {
    /**
     * @return The kernel associated with the image, if any. Only applicable
     * for machine images.
     * 
     */
    private String kernelId;

    private GetAmiResult() {}
    /**
     * @return The kernel associated with the image, if any. Only applicable
     * for machine images.
     * 
     */
    public String kernelId() {
        return this.kernelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAmiResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String kernelId;
        public Builder() {}
        public Builder(GetAmiResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kernelId = defaults.kernelId;
        }

        @CustomType.Setter
        public Builder kernelId(String kernelId) {
            if (kernelId == null) {
              throw new MissingRequiredPropertyException("GetAmiResult", "kernelId");
            }
            this.kernelId = kernelId;
            return this;
        }
        public GetAmiResult build() {
            final var _resultValue = new GetAmiResult();
            _resultValue.kernelId = kernelId;
            return _resultValue;
        }
    }
}
