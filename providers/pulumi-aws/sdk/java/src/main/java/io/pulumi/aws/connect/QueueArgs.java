// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect;

import io.pulumi.aws.connect.inputs.QueueOutboundCallerConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QueueArgs extends io.pulumi.resources.ResourceArgs {

    public static final QueueArgs Empty = new QueueArgs();

    /**
     * Specifies the description of the Queue.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Specifies the identifier of the Hours of Operation.
     * 
     */
    @Import(name="hoursOfOperationId", required=true)
      private final Output<String> hoursOfOperationId;

    public Output<String> getHoursOfOperationId() {
        return this.hoursOfOperationId;
    }

    /**
     * Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    @Import(name="instanceId", required=true)
      private final Output<String> instanceId;

    public Output<String> getInstanceId() {
        return this.instanceId;
    }

    /**
     * Specifies the maximum number of contacts that can be in the queue before it is considered full. Minimum value of 0.
     * 
     */
    @Import(name="maxContacts")
      private final @Nullable Output<Integer> maxContacts;

    public Output<Integer> getMaxContacts() {
        return this.maxContacts == null ? Output.empty() : this.maxContacts;
    }

    /**
     * Specifies the name of the Queue.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * A block that defines the outbound caller ID name, number, and outbound whisper flow. The Outbound Caller Config block is documented below.
     * 
     */
    @Import(name="outboundCallerConfig")
      private final @Nullable Output<QueueOutboundCallerConfigArgs> outboundCallerConfig;

    public Output<QueueOutboundCallerConfigArgs> getOutboundCallerConfig() {
        return this.outboundCallerConfig == null ? Output.empty() : this.outboundCallerConfig;
    }

    /**
     * Specifies a list of quick connects ids that determine the quick connects available to agents who are working the queue.
     * 
     */
    @Import(name="quickConnectIds")
      private final @Nullable Output<List<String>> quickConnectIds;

    public Output<List<String>> getQuickConnectIds() {
        return this.quickConnectIds == null ? Output.empty() : this.quickConnectIds;
    }

    /**
     * Specifies the description of the Queue. Valid values are `ENABLED`, `DISABLED`.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    /**
     * Tags to apply to the Queue. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public QueueArgs(
        @Nullable Output<String> description,
        Output<String> hoursOfOperationId,
        Output<String> instanceId,
        @Nullable Output<Integer> maxContacts,
        @Nullable Output<String> name,
        @Nullable Output<QueueOutboundCallerConfigArgs> outboundCallerConfig,
        @Nullable Output<List<String>> quickConnectIds,
        @Nullable Output<String> status,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.description = description;
        this.hoursOfOperationId = Objects.requireNonNull(hoursOfOperationId, "expected parameter 'hoursOfOperationId' to be non-null");
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.maxContacts = maxContacts;
        this.name = name;
        this.outboundCallerConfig = outboundCallerConfig;
        this.quickConnectIds = quickConnectIds;
        this.status = status;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private QueueArgs() {
        this.description = Output.empty();
        this.hoursOfOperationId = Output.empty();
        this.instanceId = Output.empty();
        this.maxContacts = Output.empty();
        this.name = Output.empty();
        this.outboundCallerConfig = Output.empty();
        this.quickConnectIds = Output.empty();
        this.status = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> hoursOfOperationId;
        private Output<String> instanceId;
        private @Nullable Output<Integer> maxContacts;
        private @Nullable Output<String> name;
        private @Nullable Output<QueueOutboundCallerConfigArgs> outboundCallerConfig;
        private @Nullable Output<List<String>> quickConnectIds;
        private @Nullable Output<String> status;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(QueueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.hoursOfOperationId = defaults.hoursOfOperationId;
    	      this.instanceId = defaults.instanceId;
    	      this.maxContacts = defaults.maxContacts;
    	      this.name = defaults.name;
    	      this.outboundCallerConfig = defaults.outboundCallerConfig;
    	      this.quickConnectIds = defaults.quickConnectIds;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder hoursOfOperationId(Output<String> hoursOfOperationId) {
            this.hoursOfOperationId = Objects.requireNonNull(hoursOfOperationId);
            return this;
        }
        public Builder hoursOfOperationId(String hoursOfOperationId) {
            this.hoursOfOperationId = Output.of(Objects.requireNonNull(hoursOfOperationId));
            return this;
        }
        public Builder instanceId(Output<String> instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Output.of(Objects.requireNonNull(instanceId));
            return this;
        }
        public Builder maxContacts(@Nullable Output<Integer> maxContacts) {
            this.maxContacts = maxContacts;
            return this;
        }
        public Builder maxContacts(@Nullable Integer maxContacts) {
            this.maxContacts = Output.ofNullable(maxContacts);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder outboundCallerConfig(@Nullable Output<QueueOutboundCallerConfigArgs> outboundCallerConfig) {
            this.outboundCallerConfig = outboundCallerConfig;
            return this;
        }
        public Builder outboundCallerConfig(@Nullable QueueOutboundCallerConfigArgs outboundCallerConfig) {
            this.outboundCallerConfig = Output.ofNullable(outboundCallerConfig);
            return this;
        }
        public Builder quickConnectIds(@Nullable Output<List<String>> quickConnectIds) {
            this.quickConnectIds = quickConnectIds;
            return this;
        }
        public Builder quickConnectIds(@Nullable List<String> quickConnectIds) {
            this.quickConnectIds = Output.ofNullable(quickConnectIds);
            return this;
        }
        public Builder quickConnectIds(String... quickConnectIds) {
            return quickConnectIds(List.of(quickConnectIds));
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Output.ofNullable(status);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }        public QueueArgs build() {
            return new QueueArgs(description, hoursOfOperationId, instanceId, maxContacts, name, outboundCallerConfig, quickConnectIds, status, tags, tagsAll);
        }
    }
}
