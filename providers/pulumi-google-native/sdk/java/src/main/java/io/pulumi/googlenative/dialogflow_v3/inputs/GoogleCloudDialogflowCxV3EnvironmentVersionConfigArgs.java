// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration for the version.
 * 
 */
public final class GoogleCloudDialogflowCxV3EnvironmentVersionConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3EnvironmentVersionConfigArgs Empty = new GoogleCloudDialogflowCxV3EnvironmentVersionConfigArgs();

    /**
     * Format: projects//locations//agents//flows//versions/.
     * 
     */
    @InputImport(name="version", required=true)
      private final Output<String> version;

    public Output<String> getVersion() {
        return this.version;
    }

    public GoogleCloudDialogflowCxV3EnvironmentVersionConfigArgs(Output<String> version) {
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private GoogleCloudDialogflowCxV3EnvironmentVersionConfigArgs() {
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3EnvironmentVersionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3EnvironmentVersionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.version = defaults.version;
        }

        public Builder version(Output<String> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public Builder version(String version) {
            this.version = Output.of(Objects.requireNonNull(version));
            return this;
        }
        public GoogleCloudDialogflowCxV3EnvironmentVersionConfigArgs build() {
            return new GoogleCloudDialogflowCxV3EnvironmentVersionConfigArgs(version);
        }
    }
}
