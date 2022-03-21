// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SnapshotArgs extends io.pulumi.resources.ResourceArgs {

    public static final SnapshotArgs Empty = new SnapshotArgs();

    /**
     * See Creating and managing labels.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    @Import(name="snapshotId", required=true)
      private final Output<String> snapshotId;

    public Output<String> getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * The subscription whose backlog the snapshot retains. Specifically, the created snapshot is guaranteed to retain: (a) The existing backlog on the subscription. More precisely, this is defined as the messages in the subscription's backlog that are unacknowledged upon the successful completion of the `CreateSnapshot` request; as well as: (b) Any messages published to the subscription's topic following the successful completion of the CreateSnapshot request. Format is `projects/{project}/subscriptions/{sub}`.
     * 
     */
    @Import(name="subscription", required=true)
      private final Output<String> subscription;

    public Output<String> getSubscription() {
        return this.subscription;
    }

    public SnapshotArgs(
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> project,
        Output<String> snapshotId,
        Output<String> subscription) {
        this.labels = labels;
        this.project = project;
        this.snapshotId = Objects.requireNonNull(snapshotId, "expected parameter 'snapshotId' to be non-null");
        this.subscription = Objects.requireNonNull(subscription, "expected parameter 'subscription' to be non-null");
    }

    private SnapshotArgs() {
        this.labels = Output.empty();
        this.project = Output.empty();
        this.snapshotId = Output.empty();
        this.subscription = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> project;
        private Output<String> snapshotId;
        private Output<String> subscription;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
    	      this.project = defaults.project;
    	      this.snapshotId = defaults.snapshotId;
    	      this.subscription = defaults.subscription;
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder snapshotId(Output<String> snapshotId) {
            this.snapshotId = Objects.requireNonNull(snapshotId);
            return this;
        }
        public Builder snapshotId(String snapshotId) {
            this.snapshotId = Output.of(Objects.requireNonNull(snapshotId));
            return this;
        }
        public Builder subscription(Output<String> subscription) {
            this.subscription = Objects.requireNonNull(subscription);
            return this;
        }
        public Builder subscription(String subscription) {
            this.subscription = Output.of(Objects.requireNonNull(subscription));
            return this;
        }        public SnapshotArgs build() {
            return new SnapshotArgs(labels, project, snapshotId, subscription);
        }
    }
}
