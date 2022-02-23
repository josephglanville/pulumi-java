// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The target Event Hub to which event data will be exported. To learn more about Security Center continuous export capabilities, visit https://aka.ms/ASCExportLearnMore
 * 
 */
public final class AutomationActionEventHubResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutomationActionEventHubResponse Empty = new AutomationActionEventHubResponse();

    /**
     * The type of the action that will be triggered by the Automation
     * Expected value is 'EventHub'.
     * 
     */
    @InputImport(name="actionType", required=true)
      private final String actionType;

    public String getActionType() {
        return this.actionType;
    }

    /**
     * The target Event Hub connection string (it will not be included in any response).
     * 
     */
    @InputImport(name="connectionString")
      private final @Nullable String connectionString;

    public Optional<String> getConnectionString() {
        return this.connectionString == null ? Optional.empty() : Optional.ofNullable(this.connectionString);
    }

    /**
     * The target Event Hub Azure Resource ID.
     * 
     */
    @InputImport(name="eventHubResourceId")
      private final @Nullable String eventHubResourceId;

    public Optional<String> getEventHubResourceId() {
        return this.eventHubResourceId == null ? Optional.empty() : Optional.ofNullable(this.eventHubResourceId);
    }

    /**
     * The target Event Hub SAS policy name.
     * 
     */
    @InputImport(name="sasPolicyName", required=true)
      private final String sasPolicyName;

    public String getSasPolicyName() {
        return this.sasPolicyName;
    }

    public AutomationActionEventHubResponse(
        String actionType,
        @Nullable String connectionString,
        @Nullable String eventHubResourceId,
        String sasPolicyName) {
        this.actionType = Objects.requireNonNull(actionType, "expected parameter 'actionType' to be non-null");
        this.connectionString = connectionString;
        this.eventHubResourceId = eventHubResourceId;
        this.sasPolicyName = Objects.requireNonNull(sasPolicyName, "expected parameter 'sasPolicyName' to be non-null");
    }

    private AutomationActionEventHubResponse() {
        this.actionType = null;
        this.connectionString = null;
        this.eventHubResourceId = null;
        this.sasPolicyName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationActionEventHubResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionType;
        private @Nullable String connectionString;
        private @Nullable String eventHubResourceId;
        private String sasPolicyName;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationActionEventHubResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionType = defaults.actionType;
    	      this.connectionString = defaults.connectionString;
    	      this.eventHubResourceId = defaults.eventHubResourceId;
    	      this.sasPolicyName = defaults.sasPolicyName;
        }

        public Builder setActionType(String actionType) {
            this.actionType = Objects.requireNonNull(actionType);
            return this;
        }

        public Builder setConnectionString(@Nullable String connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        public Builder setEventHubResourceId(@Nullable String eventHubResourceId) {
            this.eventHubResourceId = eventHubResourceId;
            return this;
        }

        public Builder setSasPolicyName(String sasPolicyName) {
            this.sasPolicyName = Objects.requireNonNull(sasPolicyName);
            return this;
        }
        public AutomationActionEventHubResponse build() {
            return new AutomationActionEventHubResponse(actionType, connectionString, eventHubResourceId, sasPolicyName);
        }
    }
}
