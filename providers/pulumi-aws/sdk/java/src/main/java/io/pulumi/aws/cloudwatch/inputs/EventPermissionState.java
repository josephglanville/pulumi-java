// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.aws.cloudwatch.inputs.EventPermissionConditionGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventPermissionState extends io.pulumi.resources.ResourceArgs {

    public static final EventPermissionState Empty = new EventPermissionState();

    /**
     * The action that you are enabling the other account to perform. Defaults to `events:PutEvents`.
     * 
     */
    @Import(name="action")
      private final @Nullable Output<String> action;

    public Output<String> getAction() {
        return this.action == null ? Output.empty() : this.action;
    }

    /**
     * Configuration block to limit the event bus permissions you are granting to only accounts that fulfill the condition. Specified below.
     * 
     */
    @Import(name="condition")
      private final @Nullable Output<EventPermissionConditionGetArgs> condition;

    public Output<EventPermissionConditionGetArgs> getCondition() {
        return this.condition == null ? Output.empty() : this.condition;
    }

    /**
     * The event bus to set the permissions on. If you omit this, the permissions are set on the `default` event bus.
     * 
     */
    @Import(name="eventBusName")
      private final @Nullable Output<String> eventBusName;

    public Output<String> getEventBusName() {
        return this.eventBusName == null ? Output.empty() : this.eventBusName;
    }

    /**
     * The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify `*` to permit any account to put events to your default event bus, optionally limited by `condition`.
     * 
     */
    @Import(name="principal")
      private final @Nullable Output<String> principal;

    public Output<String> getPrincipal() {
        return this.principal == null ? Output.empty() : this.principal;
    }

    /**
     * An identifier string for the external account that you are granting permissions to.
     * 
     */
    @Import(name="statementId")
      private final @Nullable Output<String> statementId;

    public Output<String> getStatementId() {
        return this.statementId == null ? Output.empty() : this.statementId;
    }

    public EventPermissionState(
        @Nullable Output<String> action,
        @Nullable Output<EventPermissionConditionGetArgs> condition,
        @Nullable Output<String> eventBusName,
        @Nullable Output<String> principal,
        @Nullable Output<String> statementId) {
        this.action = action;
        this.condition = condition;
        this.eventBusName = eventBusName;
        this.principal = principal;
        this.statementId = statementId;
    }

    private EventPermissionState() {
        this.action = Output.empty();
        this.condition = Output.empty();
        this.eventBusName = Output.empty();
        this.principal = Output.empty();
        this.statementId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventPermissionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> action;
        private @Nullable Output<EventPermissionConditionGetArgs> condition;
        private @Nullable Output<String> eventBusName;
        private @Nullable Output<String> principal;
        private @Nullable Output<String> statementId;

        public Builder() {
    	      // Empty
        }

        public Builder(EventPermissionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.condition = defaults.condition;
    	      this.eventBusName = defaults.eventBusName;
    	      this.principal = defaults.principal;
    	      this.statementId = defaults.statementId;
        }

        public Builder action(@Nullable Output<String> action) {
            this.action = action;
            return this;
        }
        public Builder action(@Nullable String action) {
            this.action = Output.ofNullable(action);
            return this;
        }
        public Builder condition(@Nullable Output<EventPermissionConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable EventPermissionConditionGetArgs condition) {
            this.condition = Output.ofNullable(condition);
            return this;
        }
        public Builder eventBusName(@Nullable Output<String> eventBusName) {
            this.eventBusName = eventBusName;
            return this;
        }
        public Builder eventBusName(@Nullable String eventBusName) {
            this.eventBusName = Output.ofNullable(eventBusName);
            return this;
        }
        public Builder principal(@Nullable Output<String> principal) {
            this.principal = principal;
            return this;
        }
        public Builder principal(@Nullable String principal) {
            this.principal = Output.ofNullable(principal);
            return this;
        }
        public Builder statementId(@Nullable Output<String> statementId) {
            this.statementId = statementId;
            return this;
        }
        public Builder statementId(@Nullable String statementId) {
            this.statementId = Output.ofNullable(statementId);
            return this;
        }        public EventPermissionState build() {
            return new EventPermissionState(action, condition, eventBusName, principal, statementId);
        }
    }
}