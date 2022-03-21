// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.consumption.inputs;

import io.pulumi.azurenative.consumption.enums.CultureCode;
import io.pulumi.azurenative.consumption.enums.OperatorType;
import io.pulumi.azurenative.consumption.enums.ThresholdType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The notification associated with a budget.
 * 
 */
public final class NotificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotificationArgs Empty = new NotificationArgs();

    /**
     * Email addresses to send the budget notification to when the threshold is exceeded. Must have at least one contact email or contact group specified at the Subscription or Resource Group scopes. All other scopes must have at least one contact email specified.
     * 
     */
    @Import(name="contactEmails", required=true)
      private final Output<List<String>> contactEmails;

    public Output<List<String>> getContactEmails() {
        return this.contactEmails;
    }

    /**
     * Action groups to send the budget notification to when the threshold is exceeded. Must be provided as a fully qualified Azure resource id. Only supported at Subscription or Resource Group scopes.
     * 
     */
    @Import(name="contactGroups")
      private final @Nullable Output<List<String>> contactGroups;

    public Output<List<String>> getContactGroups() {
        return this.contactGroups == null ? Output.empty() : this.contactGroups;
    }

    /**
     * Contact roles to send the budget notification to when the threshold is exceeded.
     * 
     */
    @Import(name="contactRoles")
      private final @Nullable Output<List<String>> contactRoles;

    public Output<List<String>> getContactRoles() {
        return this.contactRoles == null ? Output.empty() : this.contactRoles;
    }

    /**
     * The notification is enabled or not.
     * 
     */
    @Import(name="enabled", required=true)
      private final Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled;
    }

    /**
     * Language in which the recipient will receive the notification
     * 
     */
    @Import(name="locale")
      private final @Nullable Output<Either<String,CultureCode>> locale;

    public Output<Either<String,CultureCode>> getLocale() {
        return this.locale == null ? Output.empty() : this.locale;
    }

    /**
     * The comparison operator.
     * 
     */
    @Import(name="operator", required=true)
      private final Output<Either<String,OperatorType>> operator;

    public Output<Either<String,OperatorType>> getOperator() {
        return this.operator;
    }

    /**
     * Threshold value associated with a notification. Notification is sent when the cost exceeded the threshold. It is always percent and has to be between 0 and 1000.
     * 
     */
    @Import(name="threshold", required=true)
      private final Output<Double> threshold;

    public Output<Double> getThreshold() {
        return this.threshold;
    }

    /**
     * The type of threshold
     * 
     */
    @Import(name="thresholdType")
      private final @Nullable Output<Either<String,ThresholdType>> thresholdType;

    public Output<Either<String,ThresholdType>> getThresholdType() {
        return this.thresholdType == null ? Output.empty() : this.thresholdType;
    }

    public NotificationArgs(
        Output<List<String>> contactEmails,
        @Nullable Output<List<String>> contactGroups,
        @Nullable Output<List<String>> contactRoles,
        Output<Boolean> enabled,
        @Nullable Output<Either<String,CultureCode>> locale,
        Output<Either<String,OperatorType>> operator,
        Output<Double> threshold,
        @Nullable Output<Either<String,ThresholdType>> thresholdType) {
        this.contactEmails = Objects.requireNonNull(contactEmails, "expected parameter 'contactEmails' to be non-null");
        this.contactGroups = contactGroups;
        this.contactRoles = contactRoles;
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.locale = locale;
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
        this.threshold = Objects.requireNonNull(threshold, "expected parameter 'threshold' to be non-null");
        this.thresholdType = thresholdType == null ? Output.ofLeft("Actual") : thresholdType;
    }

    private NotificationArgs() {
        this.contactEmails = Output.empty();
        this.contactGroups = Output.empty();
        this.contactRoles = Output.empty();
        this.enabled = Output.empty();
        this.locale = Output.empty();
        this.operator = Output.empty();
        this.threshold = Output.empty();
        this.thresholdType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> contactEmails;
        private @Nullable Output<List<String>> contactGroups;
        private @Nullable Output<List<String>> contactRoles;
        private Output<Boolean> enabled;
        private @Nullable Output<Either<String,CultureCode>> locale;
        private Output<Either<String,OperatorType>> operator;
        private Output<Double> threshold;
        private @Nullable Output<Either<String,ThresholdType>> thresholdType;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactEmails = defaults.contactEmails;
    	      this.contactGroups = defaults.contactGroups;
    	      this.contactRoles = defaults.contactRoles;
    	      this.enabled = defaults.enabled;
    	      this.locale = defaults.locale;
    	      this.operator = defaults.operator;
    	      this.threshold = defaults.threshold;
    	      this.thresholdType = defaults.thresholdType;
        }

        public Builder contactEmails(Output<List<String>> contactEmails) {
            this.contactEmails = Objects.requireNonNull(contactEmails);
            return this;
        }
        public Builder contactEmails(List<String> contactEmails) {
            this.contactEmails = Output.of(Objects.requireNonNull(contactEmails));
            return this;
        }
        public Builder contactEmails(String... contactEmails) {
            return contactEmails(List.of(contactEmails));
        }
        public Builder contactGroups(@Nullable Output<List<String>> contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public Builder contactGroups(@Nullable List<String> contactGroups) {
            this.contactGroups = Output.ofNullable(contactGroups);
            return this;
        }
        public Builder contactGroups(String... contactGroups) {
            return contactGroups(List.of(contactGroups));
        }
        public Builder contactRoles(@Nullable Output<List<String>> contactRoles) {
            this.contactRoles = contactRoles;
            return this;
        }
        public Builder contactRoles(@Nullable List<String> contactRoles) {
            this.contactRoles = Output.ofNullable(contactRoles);
            return this;
        }
        public Builder contactRoles(String... contactRoles) {
            return contactRoles(List.of(contactRoles));
        }
        public Builder enabled(Output<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Output.of(Objects.requireNonNull(enabled));
            return this;
        }
        public Builder locale(@Nullable Output<Either<String,CultureCode>> locale) {
            this.locale = locale;
            return this;
        }
        public Builder locale(@Nullable Either<String,CultureCode> locale) {
            this.locale = Output.ofNullable(locale);
            return this;
        }
        public Builder operator(Output<Either<String,OperatorType>> operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        public Builder operator(Either<String,OperatorType> operator) {
            this.operator = Output.of(Objects.requireNonNull(operator));
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
        public Builder thresholdType(@Nullable Output<Either<String,ThresholdType>> thresholdType) {
            this.thresholdType = thresholdType;
            return this;
        }
        public Builder thresholdType(@Nullable Either<String,ThresholdType> thresholdType) {
            this.thresholdType = Output.ofNullable(thresholdType);
            return this;
        }        public NotificationArgs build() {
            return new NotificationArgs(contactEmails, contactGroups, contactRoles, enabled, locale, operator, threshold, thresholdType);
        }
    }
}
