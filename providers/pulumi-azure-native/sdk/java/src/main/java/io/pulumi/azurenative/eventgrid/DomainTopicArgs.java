// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainTopicArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainTopicArgs Empty = new DomainTopicArgs();

    /**
     * Name of the domain.
     * 
     */
    @Import(name="domainName", required=true)
      private final Output<String> domainName;

    public Output<String> getDomainName() {
        return this.domainName;
    }

    /**
     * Name of the domain topic.
     * 
     */
    @Import(name="domainTopicName")
      private final @Nullable Output<String> domainTopicName;

    public Output<String> getDomainTopicName() {
        return this.domainTopicName == null ? Output.empty() : this.domainTopicName;
    }

    /**
     * The name of the resource group within the user's subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public DomainTopicArgs(
        Output<String> domainName,
        @Nullable Output<String> domainTopicName,
        Output<String> resourceGroupName) {
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.domainTopicName = domainTopicName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private DomainTopicArgs() {
        this.domainName = Output.empty();
        this.domainTopicName = Output.empty();
        this.resourceGroupName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainTopicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> domainName;
        private @Nullable Output<String> domainTopicName;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainTopicArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.domainTopicName = defaults.domainTopicName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder domainName(Output<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        public Builder domainName(String domainName) {
            this.domainName = Output.of(Objects.requireNonNull(domainName));
            return this;
        }
        public Builder domainTopicName(@Nullable Output<String> domainTopicName) {
            this.domainTopicName = domainTopicName;
            return this;
        }
        public Builder domainTopicName(@Nullable String domainTopicName) {
            this.domainTopicName = Output.ofNullable(domainTopicName);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }        public DomainTopicArgs build() {
            return new DomainTopicArgs(domainName, domainTopicName, resourceGroupName);
        }
    }
}
