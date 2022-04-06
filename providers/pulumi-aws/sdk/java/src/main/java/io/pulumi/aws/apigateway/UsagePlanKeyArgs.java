// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class UsagePlanKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final UsagePlanKeyArgs Empty = new UsagePlanKeyArgs();

    /**
     * The identifier of the API key resource.
     * 
     */
    @Import(name="keyId", required=true)
      private final Output<String> keyId;

    public Output<String> getKeyId() {
        return this.keyId;
    }

    /**
     * The type of the API key resource. Currently, the valid key type is API_KEY.
     * 
     */
    @Import(name="keyType", required=true)
      private final Output<String> keyType;

    public Output<String> getKeyType() {
        return this.keyType;
    }

    /**
     * The Id of the usage plan resource representing to associate the key to.
     * 
     */
    @Import(name="usagePlanId", required=true)
      private final Output<String> usagePlanId;

    public Output<String> getUsagePlanId() {
        return this.usagePlanId;
    }

    public UsagePlanKeyArgs(
        Output<String> keyId,
        Output<String> keyType,
        Output<String> usagePlanId) {
        this.keyId = Objects.requireNonNull(keyId, "expected parameter 'keyId' to be non-null");
        this.keyType = Objects.requireNonNull(keyType, "expected parameter 'keyType' to be non-null");
        this.usagePlanId = Objects.requireNonNull(usagePlanId, "expected parameter 'usagePlanId' to be non-null");
    }

    private UsagePlanKeyArgs() {
        this.keyId = Output.empty();
        this.keyType = Output.empty();
        this.usagePlanId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UsagePlanKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> keyId;
        private Output<String> keyType;
        private Output<String> usagePlanId;

        public Builder() {
    	      // Empty
        }

        public Builder(UsagePlanKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyId = defaults.keyId;
    	      this.keyType = defaults.keyType;
    	      this.usagePlanId = defaults.usagePlanId;
        }

        public Builder keyId(Output<String> keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }
        public Builder keyId(String keyId) {
            this.keyId = Output.of(Objects.requireNonNull(keyId));
            return this;
        }
        public Builder keyType(Output<String> keyType) {
            this.keyType = Objects.requireNonNull(keyType);
            return this;
        }
        public Builder keyType(String keyType) {
            this.keyType = Output.of(Objects.requireNonNull(keyType));
            return this;
        }
        public Builder usagePlanId(Output<String> usagePlanId) {
            this.usagePlanId = Objects.requireNonNull(usagePlanId);
            return this;
        }
        public Builder usagePlanId(String usagePlanId) {
            this.usagePlanId = Output.of(Objects.requireNonNull(usagePlanId));
            return this;
        }        public UsagePlanKeyArgs build() {
            return new UsagePlanKeyArgs(keyId, keyType, usagePlanId);
        }
    }
}