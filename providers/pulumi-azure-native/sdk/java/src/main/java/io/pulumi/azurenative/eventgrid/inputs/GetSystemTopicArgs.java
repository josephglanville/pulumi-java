// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSystemTopicArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSystemTopicArgs Empty = new GetSystemTopicArgs();

    /**
     * The name of the resource group within the user's subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the system topic.
     * 
     */
    @Import(name="systemTopicName", required=true)
      private final String systemTopicName;

    public String getSystemTopicName() {
        return this.systemTopicName;
    }

    public GetSystemTopicArgs(
        String resourceGroupName,
        String systemTopicName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.systemTopicName = Objects.requireNonNull(systemTopicName, "expected parameter 'systemTopicName' to be non-null");
    }

    private GetSystemTopicArgs() {
        this.resourceGroupName = null;
        this.systemTopicName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSystemTopicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String systemTopicName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSystemTopicArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.systemTopicName = defaults.systemTopicName;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder systemTopicName(String systemTopicName) {
            this.systemTopicName = Objects.requireNonNull(systemTopicName);
            return this;
        }        public GetSystemTopicArgs build() {
            return new GetSystemTopicArgs(resourceGroupName, systemTopicName);
        }
    }
}
