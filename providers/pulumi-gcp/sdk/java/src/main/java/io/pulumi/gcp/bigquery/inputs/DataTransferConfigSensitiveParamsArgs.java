// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DataTransferConfigSensitiveParamsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataTransferConfigSensitiveParamsArgs Empty = new DataTransferConfigSensitiveParamsArgs();

    @InputImport(name="secretAccessKey", required=true)
    private final Input<String> secretAccessKey;

    public Input<String> getSecretAccessKey() {
        return this.secretAccessKey;
    }

    public DataTransferConfigSensitiveParamsArgs(Input<String> secretAccessKey) {
        this.secretAccessKey = Objects.requireNonNull(secretAccessKey, "expected parameter 'secretAccessKey' to be non-null");
    }

    private DataTransferConfigSensitiveParamsArgs() {
        this.secretAccessKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataTransferConfigSensitiveParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> secretAccessKey;

        public Builder() {
    	      // Empty
        }

        public Builder(DataTransferConfigSensitiveParamsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretAccessKey = defaults.secretAccessKey;
        }

        public Builder setSecretAccessKey(Input<String> secretAccessKey) {
            this.secretAccessKey = Objects.requireNonNull(secretAccessKey);
            return this;
        }

        public Builder setSecretAccessKey(String secretAccessKey) {
            this.secretAccessKey = Input.of(Objects.requireNonNull(secretAccessKey));
            return this;
        }

        public DataTransferConfigSensitiveParamsArgs build() {
            return new DataTransferConfigSensitiveParamsArgs(secretAccessKey);
        }
    }
}