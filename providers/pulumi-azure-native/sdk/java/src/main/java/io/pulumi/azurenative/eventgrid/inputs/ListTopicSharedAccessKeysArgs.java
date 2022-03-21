// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListTopicSharedAccessKeysArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListTopicSharedAccessKeysArgs Empty = new ListTopicSharedAccessKeysArgs();

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
     * Name of the topic.
     * 
     */
    @Import(name="topicName", required=true)
      private final String topicName;

    public String getTopicName() {
        return this.topicName;
    }

    public ListTopicSharedAccessKeysArgs(
        String resourceGroupName,
        String topicName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.topicName = Objects.requireNonNull(topicName, "expected parameter 'topicName' to be non-null");
    }

    private ListTopicSharedAccessKeysArgs() {
        this.resourceGroupName = null;
        this.topicName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListTopicSharedAccessKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String topicName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListTopicSharedAccessKeysArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.topicName = defaults.topicName;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder topicName(String topicName) {
            this.topicName = Objects.requireNonNull(topicName);
            return this;
        }        public ListTopicSharedAccessKeysArgs build() {
            return new ListTopicSharedAccessKeysArgs(resourceGroupName, topicName);
        }
    }
}
