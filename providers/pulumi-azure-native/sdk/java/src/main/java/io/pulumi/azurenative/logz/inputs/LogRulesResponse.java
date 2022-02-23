// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.inputs;

import io.pulumi.azurenative.logz.inputs.FilteringTagResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Set of rules for sending logs for the Monitor resource.
 * 
 */
public final class LogRulesResponse extends io.pulumi.resources.InvokeArgs {

    public static final LogRulesResponse Empty = new LogRulesResponse();

    /**
     * List of filtering tags to be used for capturing logs. This only takes effect if SendActivityLogs flag is enabled. If empty, all resources will be captured. If only Exclude action is specified, the rules will apply to the list of all available resources. If Include actions are specified, the rules will only include resources with the associated tags.
     * 
     */
    @InputImport(name="filteringTags")
      private final @Nullable List<FilteringTagResponse> filteringTags;

    public List<FilteringTagResponse> getFilteringTags() {
        return this.filteringTags == null ? List.of() : this.filteringTags;
    }

    /**
     * Flag specifying if AAD logs should be sent for the Monitor resource.
     * 
     */
    @InputImport(name="sendAadLogs")
      private final @Nullable Boolean sendAadLogs;

    public Optional<Boolean> getSendAadLogs() {
        return this.sendAadLogs == null ? Optional.empty() : Optional.ofNullable(this.sendAadLogs);
    }

    /**
     * Flag specifying if activity logs from Azure resources should be sent for the Monitor resource.
     * 
     */
    @InputImport(name="sendActivityLogs")
      private final @Nullable Boolean sendActivityLogs;

    public Optional<Boolean> getSendActivityLogs() {
        return this.sendActivityLogs == null ? Optional.empty() : Optional.ofNullable(this.sendActivityLogs);
    }

    /**
     * Flag specifying if subscription logs should be sent for the Monitor resource.
     * 
     */
    @InputImport(name="sendSubscriptionLogs")
      private final @Nullable Boolean sendSubscriptionLogs;

    public Optional<Boolean> getSendSubscriptionLogs() {
        return this.sendSubscriptionLogs == null ? Optional.empty() : Optional.ofNullable(this.sendSubscriptionLogs);
    }

    public LogRulesResponse(
        @Nullable List<FilteringTagResponse> filteringTags,
        @Nullable Boolean sendAadLogs,
        @Nullable Boolean sendActivityLogs,
        @Nullable Boolean sendSubscriptionLogs) {
        this.filteringTags = filteringTags;
        this.sendAadLogs = sendAadLogs;
        this.sendActivityLogs = sendActivityLogs;
        this.sendSubscriptionLogs = sendSubscriptionLogs;
    }

    private LogRulesResponse() {
        this.filteringTags = List.of();
        this.sendAadLogs = null;
        this.sendActivityLogs = null;
        this.sendSubscriptionLogs = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogRulesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<FilteringTagResponse> filteringTags;
        private @Nullable Boolean sendAadLogs;
        private @Nullable Boolean sendActivityLogs;
        private @Nullable Boolean sendSubscriptionLogs;

        public Builder() {
    	      // Empty
        }

        public Builder(LogRulesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filteringTags = defaults.filteringTags;
    	      this.sendAadLogs = defaults.sendAadLogs;
    	      this.sendActivityLogs = defaults.sendActivityLogs;
    	      this.sendSubscriptionLogs = defaults.sendSubscriptionLogs;
        }

        public Builder setFilteringTags(@Nullable List<FilteringTagResponse> filteringTags) {
            this.filteringTags = filteringTags;
            return this;
        }

        public Builder setSendAadLogs(@Nullable Boolean sendAadLogs) {
            this.sendAadLogs = sendAadLogs;
            return this;
        }

        public Builder setSendActivityLogs(@Nullable Boolean sendActivityLogs) {
            this.sendActivityLogs = sendActivityLogs;
            return this;
        }

        public Builder setSendSubscriptionLogs(@Nullable Boolean sendSubscriptionLogs) {
            this.sendSubscriptionLogs = sendSubscriptionLogs;
            return this;
        }
        public LogRulesResponse build() {
            return new LogRulesResponse(filteringTags, sendAadLogs, sendActivityLogs, sendSubscriptionLogs);
        }
    }
}
