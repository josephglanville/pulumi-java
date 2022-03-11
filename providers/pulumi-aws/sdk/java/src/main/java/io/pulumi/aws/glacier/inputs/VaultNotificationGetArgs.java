// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glacier.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class VaultNotificationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VaultNotificationGetArgs Empty = new VaultNotificationGetArgs();

    /**
     * You can configure a vault to publish a notification for `ArchiveRetrievalCompleted` and `InventoryRetrievalCompleted` events.
     * 
     */
    @InputImport(name="events", required=true)
      private final Output<List<String>> events;

    public Output<List<String>> getEvents() {
        return this.events;
    }

    /**
     * The SNS Topic ARN.
     * 
     */
    @InputImport(name="snsTopic", required=true)
      private final Output<String> snsTopic;

    public Output<String> getSnsTopic() {
        return this.snsTopic;
    }

    public VaultNotificationGetArgs(
        Output<List<String>> events,
        Output<String> snsTopic) {
        this.events = Objects.requireNonNull(events, "expected parameter 'events' to be non-null");
        this.snsTopic = Objects.requireNonNull(snsTopic, "expected parameter 'snsTopic' to be non-null");
    }

    private VaultNotificationGetArgs() {
        this.events = Output.empty();
        this.snsTopic = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultNotificationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> events;
        private Output<String> snsTopic;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultNotificationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.events = defaults.events;
    	      this.snsTopic = defaults.snsTopic;
        }

        public Builder events(Output<List<String>> events) {
            this.events = Objects.requireNonNull(events);
            return this;
        }

        public Builder events(List<String> events) {
            this.events = Output.of(Objects.requireNonNull(events));
            return this;
        }

        public Builder snsTopic(Output<String> snsTopic) {
            this.snsTopic = Objects.requireNonNull(snsTopic);
            return this;
        }

        public Builder snsTopic(String snsTopic) {
            this.snsTopic = Output.of(Objects.requireNonNull(snsTopic));
            return this;
        }
        public VaultNotificationGetArgs build() {
            return new VaultNotificationGetArgs(events, snsTopic);
        }
    }
}
