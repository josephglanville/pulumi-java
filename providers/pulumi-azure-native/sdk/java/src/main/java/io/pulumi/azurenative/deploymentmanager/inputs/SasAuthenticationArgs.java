// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the properties to access the artifacts using an Azure Storage SAS URI.
 * 
 */
public final class SasAuthenticationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SasAuthenticationArgs Empty = new SasAuthenticationArgs();

    /**
     * The SAS URI to the Azure Storage blob container. Any offset from the root of the container to where the artifacts are located can be defined in the artifactRoot.
     * 
     */
    @Import(name="sasUri", required=true)
      private final Output<String> sasUri;

    public Output<String> getSasUri() {
        return this.sasUri;
    }

    /**
     * The authentication type
     * Expected value is 'Sas'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public SasAuthenticationArgs(
        Output<String> sasUri,
        Output<String> type) {
        this.sasUri = Objects.requireNonNull(sasUri, "expected parameter 'sasUri' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SasAuthenticationArgs() {
        this.sasUri = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SasAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> sasUri;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SasAuthenticationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sasUri = defaults.sasUri;
    	      this.type = defaults.type;
        }

        public Builder sasUri(Output<String> sasUri) {
            this.sasUri = Objects.requireNonNull(sasUri);
            return this;
        }
        public Builder sasUri(String sasUri) {
            this.sasUri = Output.of(Objects.requireNonNull(sasUri));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public SasAuthenticationArgs build() {
            return new SasAuthenticationArgs(sasUri, type);
        }
    }
}
