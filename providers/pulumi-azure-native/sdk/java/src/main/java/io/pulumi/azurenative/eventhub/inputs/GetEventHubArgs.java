// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetEventHubArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEventHubArgs Empty = new GetEventHubArgs();

    @InputImport(name="eventHubName", required=true)
    private final String eventHubName;

    public String getEventHubName() {
        return this.eventHubName;
    }

    @InputImport(name="namespaceName", required=true)
    private final String namespaceName;

    public String getNamespaceName() {
        return this.namespaceName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetEventHubArgs(
        String eventHubName,
        String namespaceName,
        String resourceGroupName) {
        this.eventHubName = Objects.requireNonNull(eventHubName, "expected parameter 'eventHubName' to be non-null");
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetEventHubArgs() {
        this.eventHubName = null;
        this.namespaceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventHubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String eventHubName;
        private String namespaceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEventHubArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventHubName = defaults.eventHubName;
    	      this.namespaceName = defaults.namespaceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setEventHubName(String eventHubName) {
            this.eventHubName = Objects.requireNonNull(eventHubName);
            return this;
        }

        public Builder setNamespaceName(String namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetEventHubArgs build() {
            return new GetEventHubArgs(eventHubName, namespaceName, resourceGroupName);
        }
    }
}
