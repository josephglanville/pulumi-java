// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class PolicyNetworkArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyNetworkArgs Empty = new PolicyNetworkArgs();

    /**
     * The id or fully qualified URL of the VPC network to forward queries to.
     * This should be formatted like `projects/{project}/global/networks/{network}` or
     * `https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}`
     * 
     */
    @InputImport(name="networkUrl", required=true)
      private final Input<String> networkUrl;

    public Input<String> getNetworkUrl() {
        return this.networkUrl;
    }

    public PolicyNetworkArgs(Input<String> networkUrl) {
        this.networkUrl = Objects.requireNonNull(networkUrl, "expected parameter 'networkUrl' to be non-null");
    }

    private PolicyNetworkArgs() {
        this.networkUrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> networkUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyNetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkUrl = defaults.networkUrl;
        }

        public Builder setNetworkUrl(Input<String> networkUrl) {
            this.networkUrl = Objects.requireNonNull(networkUrl);
            return this;
        }

        public Builder setNetworkUrl(String networkUrl) {
            this.networkUrl = Input.of(Objects.requireNonNull(networkUrl));
            return this;
        }
        public PolicyNetworkArgs build() {
            return new PolicyNetworkArgs(networkUrl);
        }
    }
}
