// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventArchiveState extends io.pulumi.resources.ResourceArgs {

    public static final EventArchiveState Empty = new EventArchiveState();

    /**
     * The Amazon Resource Name (ARN) of the event archive.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The description of the new event archive.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Instructs the new event archive to only capture events matched by this pattern. By default, it attempts to archive every event received in the `event_source_arn`.
     * 
     */
    @Import(name="eventPattern")
      private final @Nullable Output<String> eventPattern;

    public Output<String> getEventPattern() {
        return this.eventPattern == null ? Codegen.empty() : this.eventPattern;
    }

    /**
     * Event bus source ARN from where these events should be archived.
     * 
     */
    @Import(name="eventSourceArn")
      private final @Nullable Output<String> eventSourceArn;

    public Output<String> getEventSourceArn() {
        return this.eventSourceArn == null ? Codegen.empty() : this.eventSourceArn;
    }

    /**
     * The name of the new event archive. The archive name cannot exceed 48 characters.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The maximum number of days to retain events in the new event archive. By default, it archives indefinitely.
     * 
     */
    @Import(name="retentionDays")
      private final @Nullable Output<Integer> retentionDays;

    public Output<Integer> getRetentionDays() {
        return this.retentionDays == null ? Codegen.empty() : this.retentionDays;
    }

    public EventArchiveState(
        @Nullable Output<String> arn,
        @Nullable Output<String> description,
        @Nullable Output<String> eventPattern,
        @Nullable Output<String> eventSourceArn,
        @Nullable Output<String> name,
        @Nullable Output<Integer> retentionDays) {
        this.arn = arn;
        this.description = description;
        this.eventPattern = eventPattern;
        this.eventSourceArn = eventSourceArn;
        this.name = name;
        this.retentionDays = retentionDays;
    }

    private EventArchiveState() {
        this.arn = Codegen.empty();
        this.description = Codegen.empty();
        this.eventPattern = Codegen.empty();
        this.eventSourceArn = Codegen.empty();
        this.name = Codegen.empty();
        this.retentionDays = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventArchiveState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> description;
        private @Nullable Output<String> eventPattern;
        private @Nullable Output<String> eventSourceArn;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> retentionDays;

        public Builder() {
    	      // Empty
        }

        public Builder(EventArchiveState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.eventPattern = defaults.eventPattern;
    	      this.eventSourceArn = defaults.eventSourceArn;
    	      this.name = defaults.name;
    	      this.retentionDays = defaults.retentionDays;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder eventPattern(@Nullable Output<String> eventPattern) {
            this.eventPattern = eventPattern;
            return this;
        }
        public Builder eventPattern(@Nullable String eventPattern) {
            this.eventPattern = Codegen.ofNullable(eventPattern);
            return this;
        }
        public Builder eventSourceArn(@Nullable Output<String> eventSourceArn) {
            this.eventSourceArn = eventSourceArn;
            return this;
        }
        public Builder eventSourceArn(@Nullable String eventSourceArn) {
            this.eventSourceArn = Codegen.ofNullable(eventSourceArn);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder retentionDays(@Nullable Output<Integer> retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }
        public Builder retentionDays(@Nullable Integer retentionDays) {
            this.retentionDays = Codegen.ofNullable(retentionDays);
            return this;
        }        public EventArchiveState build() {
            return new EventArchiveState(arn, description, eventPattern, eventSourceArn, name, retentionDays);
        }
    }
}
