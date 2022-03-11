// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.budgets.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BudgetNotificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BudgetNotificationArgs Empty = new BudgetNotificationArgs();

    /**
     * (Required) Comparison operator to use to evaluate the condition. Can be `LESS_THAN`, `EQUAL_TO` or `GREATER_THAN`.
     * 
     */
    @InputImport(name="comparisonOperator", required=true)
      private final Output<String> comparisonOperator;

    public Output<String> getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * (Required) What kind of budget value to notify on. Can be `ACTUAL` or `FORECASTED`
     * 
     */
    @InputImport(name="notificationType", required=true)
      private final Output<String> notificationType;

    public Output<String> getNotificationType() {
        return this.notificationType;
    }

    /**
     * (Optional) E-Mail addresses to notify. Either this or `subscriber_sns_topic_arns` is required.
     * 
     */
    @InputImport(name="subscriberEmailAddresses")
      private final @Nullable Output<List<String>> subscriberEmailAddresses;

    public Output<List<String>> getSubscriberEmailAddresses() {
        return this.subscriberEmailAddresses == null ? Output.empty() : this.subscriberEmailAddresses;
    }

    /**
     * (Optional) SNS topics to notify. Either this or `subscriber_email_addresses` is required.
     * 
     */
    @InputImport(name="subscriberSnsTopicArns")
      private final @Nullable Output<List<String>> subscriberSnsTopicArns;

    public Output<List<String>> getSubscriberSnsTopicArns() {
        return this.subscriberSnsTopicArns == null ? Output.empty() : this.subscriberSnsTopicArns;
    }

    /**
     * (Required) Threshold when the notification should be sent.
     * 
     */
    @InputImport(name="threshold", required=true)
      private final Output<Double> threshold;

    public Output<Double> getThreshold() {
        return this.threshold;
    }

    /**
     * (Required) What kind of threshold is defined. Can be `PERCENTAGE` OR `ABSOLUTE_VALUE`.
     * 
     */
    @InputImport(name="thresholdType", required=true)
      private final Output<String> thresholdType;

    public Output<String> getThresholdType() {
        return this.thresholdType;
    }

    public BudgetNotificationArgs(
        Output<String> comparisonOperator,
        Output<String> notificationType,
        @Nullable Output<List<String>> subscriberEmailAddresses,
        @Nullable Output<List<String>> subscriberSnsTopicArns,
        Output<Double> threshold,
        Output<String> thresholdType) {
        this.comparisonOperator = Objects.requireNonNull(comparisonOperator, "expected parameter 'comparisonOperator' to be non-null");
        this.notificationType = Objects.requireNonNull(notificationType, "expected parameter 'notificationType' to be non-null");
        this.subscriberEmailAddresses = subscriberEmailAddresses;
        this.subscriberSnsTopicArns = subscriberSnsTopicArns;
        this.threshold = Objects.requireNonNull(threshold, "expected parameter 'threshold' to be non-null");
        this.thresholdType = Objects.requireNonNull(thresholdType, "expected parameter 'thresholdType' to be non-null");
    }

    private BudgetNotificationArgs() {
        this.comparisonOperator = Output.empty();
        this.notificationType = Output.empty();
        this.subscriberEmailAddresses = Output.empty();
        this.subscriberSnsTopicArns = Output.empty();
        this.threshold = Output.empty();
        this.thresholdType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetNotificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> comparisonOperator;
        private Output<String> notificationType;
        private @Nullable Output<List<String>> subscriberEmailAddresses;
        private @Nullable Output<List<String>> subscriberSnsTopicArns;
        private Output<Double> threshold;
        private Output<String> thresholdType;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetNotificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.notificationType = defaults.notificationType;
    	      this.subscriberEmailAddresses = defaults.subscriberEmailAddresses;
    	      this.subscriberSnsTopicArns = defaults.subscriberSnsTopicArns;
    	      this.threshold = defaults.threshold;
    	      this.thresholdType = defaults.thresholdType;
        }

        public Builder comparisonOperator(Output<String> comparisonOperator) {
            this.comparisonOperator = Objects.requireNonNull(comparisonOperator);
            return this;
        }

        public Builder comparisonOperator(String comparisonOperator) {
            this.comparisonOperator = Output.of(Objects.requireNonNull(comparisonOperator));
            return this;
        }

        public Builder notificationType(Output<String> notificationType) {
            this.notificationType = Objects.requireNonNull(notificationType);
            return this;
        }

        public Builder notificationType(String notificationType) {
            this.notificationType = Output.of(Objects.requireNonNull(notificationType));
            return this;
        }

        public Builder subscriberEmailAddresses(@Nullable Output<List<String>> subscriberEmailAddresses) {
            this.subscriberEmailAddresses = subscriberEmailAddresses;
            return this;
        }

        public Builder subscriberEmailAddresses(@Nullable List<String> subscriberEmailAddresses) {
            this.subscriberEmailAddresses = Output.ofNullable(subscriberEmailAddresses);
            return this;
        }

        public Builder subscriberSnsTopicArns(@Nullable Output<List<String>> subscriberSnsTopicArns) {
            this.subscriberSnsTopicArns = subscriberSnsTopicArns;
            return this;
        }

        public Builder subscriberSnsTopicArns(@Nullable List<String> subscriberSnsTopicArns) {
            this.subscriberSnsTopicArns = Output.ofNullable(subscriberSnsTopicArns);
            return this;
        }

        public Builder threshold(Output<Double> threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }

        public Builder threshold(Double threshold) {
            this.threshold = Output.of(Objects.requireNonNull(threshold));
            return this;
        }

        public Builder thresholdType(Output<String> thresholdType) {
            this.thresholdType = Objects.requireNonNull(thresholdType);
            return this;
        }

        public Builder thresholdType(String thresholdType) {
            this.thresholdType = Output.of(Objects.requireNonNull(thresholdType));
            return this;
        }
        public BudgetNotificationArgs build() {
            return new BudgetNotificationArgs(comparisonOperator, notificationType, subscriberEmailAddresses, subscriberSnsTopicArns, threshold, thresholdType);
        }
    }
}
