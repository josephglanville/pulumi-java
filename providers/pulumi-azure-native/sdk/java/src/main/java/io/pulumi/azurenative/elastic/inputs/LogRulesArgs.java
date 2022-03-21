// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.elastic.inputs;

import io.pulumi.azurenative.elastic.inputs.FilteringTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Set of rules for sending logs for the Monitor resource.
 * 
 */
public final class LogRulesArgs extends io.pulumi.resources.ResourceArgs {

    public static final LogRulesArgs Empty = new LogRulesArgs();

    /**
     * List of filtering tags to be used for capturing logs. This only takes effect if SendActivityLogs flag is enabled. If empty, all resources will be captured. If only Exclude action is specified, the rules will apply to the list of all available resources. If Include actions are specified, the rules will only include resources with the associated tags.
     * 
     */
    @Import(name="filteringTags")
      private final @Nullable Output<List<FilteringTagArgs>> filteringTags;

    public Output<List<FilteringTagArgs>> getFilteringTags() {
        return this.filteringTags == null ? Output.empty() : this.filteringTags;
    }

    /**
     * Flag specifying if AAD logs should be sent for the Monitor resource.
     * 
     */
    @Import(name="sendAadLogs")
      private final @Nullable Output<Boolean> sendAadLogs;

    public Output<Boolean> getSendAadLogs() {
        return this.sendAadLogs == null ? Output.empty() : this.sendAadLogs;
    }

    /**
     * Flag specifying if activity logs from Azure resources should be sent for the Monitor resource.
     * 
     */
    @Import(name="sendActivityLogs")
      private final @Nullable Output<Boolean> sendActivityLogs;

    public Output<Boolean> getSendActivityLogs() {
        return this.sendActivityLogs == null ? Output.empty() : this.sendActivityLogs;
    }

    /**
     * Flag specifying if subscription logs should be sent for the Monitor resource.
     * 
     */
    @Import(name="sendSubscriptionLogs")
      private final @Nullable Output<Boolean> sendSubscriptionLogs;

    public Output<Boolean> getSendSubscriptionLogs() {
        return this.sendSubscriptionLogs == null ? Output.empty() : this.sendSubscriptionLogs;
    }

    public LogRulesArgs(
        @Nullable Output<List<FilteringTagArgs>> filteringTags,
        @Nullable Output<Boolean> sendAadLogs,
        @Nullable Output<Boolean> sendActivityLogs,
        @Nullable Output<Boolean> sendSubscriptionLogs) {
        this.filteringTags = filteringTags;
        this.sendAadLogs = sendAadLogs;
        this.sendActivityLogs = sendActivityLogs;
        this.sendSubscriptionLogs = sendSubscriptionLogs;
    }

    private LogRulesArgs() {
        this.filteringTags = Output.empty();
        this.sendAadLogs = Output.empty();
        this.sendActivityLogs = Output.empty();
        this.sendSubscriptionLogs = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<FilteringTagArgs>> filteringTags;
        private @Nullable Output<Boolean> sendAadLogs;
        private @Nullable Output<Boolean> sendActivityLogs;
        private @Nullable Output<Boolean> sendSubscriptionLogs;

        public Builder() {
    	      // Empty
        }

        public Builder(LogRulesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filteringTags = defaults.filteringTags;
    	      this.sendAadLogs = defaults.sendAadLogs;
    	      this.sendActivityLogs = defaults.sendActivityLogs;
    	      this.sendSubscriptionLogs = defaults.sendSubscriptionLogs;
        }

        public Builder filteringTags(@Nullable Output<List<FilteringTagArgs>> filteringTags) {
            this.filteringTags = filteringTags;
            return this;
        }
        public Builder filteringTags(@Nullable List<FilteringTagArgs> filteringTags) {
            this.filteringTags = Output.ofNullable(filteringTags);
            return this;
        }
        public Builder filteringTags(FilteringTagArgs... filteringTags) {
            return filteringTags(List.of(filteringTags));
        }
        public Builder sendAadLogs(@Nullable Output<Boolean> sendAadLogs) {
            this.sendAadLogs = sendAadLogs;
            return this;
        }
        public Builder sendAadLogs(@Nullable Boolean sendAadLogs) {
            this.sendAadLogs = Output.ofNullable(sendAadLogs);
            return this;
        }
        public Builder sendActivityLogs(@Nullable Output<Boolean> sendActivityLogs) {
            this.sendActivityLogs = sendActivityLogs;
            return this;
        }
        public Builder sendActivityLogs(@Nullable Boolean sendActivityLogs) {
            this.sendActivityLogs = Output.ofNullable(sendActivityLogs);
            return this;
        }
        public Builder sendSubscriptionLogs(@Nullable Output<Boolean> sendSubscriptionLogs) {
            this.sendSubscriptionLogs = sendSubscriptionLogs;
            return this;
        }
        public Builder sendSubscriptionLogs(@Nullable Boolean sendSubscriptionLogs) {
            this.sendSubscriptionLogs = Output.ofNullable(sendSubscriptionLogs);
            return this;
        }        public LogRulesArgs build() {
            return new LogRulesArgs(filteringTags, sendAadLogs, sendActivityLogs, sendSubscriptionLogs);
        }
    }
}
