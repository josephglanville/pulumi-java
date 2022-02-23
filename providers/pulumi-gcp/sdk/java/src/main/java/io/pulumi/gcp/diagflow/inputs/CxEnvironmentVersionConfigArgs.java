// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class CxEnvironmentVersionConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxEnvironmentVersionConfigArgs Empty = new CxEnvironmentVersionConfigArgs();

    /**
     * Format: projects/{{project}}/locations/{{location}}/agents/{{agent}}/flows/{{flow}}/versions/{{version}}.
     * 
     */
    @InputImport(name="version", required=true)
      private final Input<String> version;

    public Input<String> getVersion() {
        return this.version;
    }

    public CxEnvironmentVersionConfigArgs(Input<String> version) {
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private CxEnvironmentVersionConfigArgs() {
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxEnvironmentVersionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(CxEnvironmentVersionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.version = defaults.version;
        }

        public Builder setVersion(Input<String> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Input.of(Objects.requireNonNull(version));
            return this;
        }
        public CxEnvironmentVersionConfigArgs build() {
            return new CxEnvironmentVersionConfigArgs(version);
        }
    }
}
