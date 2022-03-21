// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.servicemanagement_v1.outputs.UsageRuleResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class UsageResponse {
    /**
     * The full resource name of a channel used for sending notifications to the service producer. Google Service Management currently only supports [Google Cloud Pub/Sub](https://cloud.google.com/pubsub) as a notification channel. To use Google Cloud Pub/Sub as the channel, this must be the name of a Cloud Pub/Sub topic that uses the Cloud Pub/Sub topic name format documented in https://cloud.google.com/pubsub/docs/overview.
     * 
     */
    private final String producerNotificationChannel;
    /**
     * Requirements that must be satisfied before a consumer project can use the service. Each requirement is of the form /; for example 'serviceusage.googleapis.com/billing-enabled'. For Google APIs, a Terms of Service requirement must be included here. Google Cloud APIs must include "serviceusage.googleapis.com/tos/cloud". Other Google APIs should include "serviceusage.googleapis.com/tos/universal". Additional ToS can be included based on the business needs.
     * 
     */
    private final List<String> requirements;
    /**
     * A list of usage rules that apply to individual API methods. **NOTE:** All service configuration rules follow "last one wins" order.
     * 
     */
    private final List<UsageRuleResponse> rules;

    @CustomType.Constructor
    private UsageResponse(
        @CustomType.Parameter("producerNotificationChannel") String producerNotificationChannel,
        @CustomType.Parameter("requirements") List<String> requirements,
        @CustomType.Parameter("rules") List<UsageRuleResponse> rules) {
        this.producerNotificationChannel = producerNotificationChannel;
        this.requirements = requirements;
        this.rules = rules;
    }

    /**
     * The full resource name of a channel used for sending notifications to the service producer. Google Service Management currently only supports [Google Cloud Pub/Sub](https://cloud.google.com/pubsub) as a notification channel. To use Google Cloud Pub/Sub as the channel, this must be the name of a Cloud Pub/Sub topic that uses the Cloud Pub/Sub topic name format documented in https://cloud.google.com/pubsub/docs/overview.
     * 
    */
    public String getProducerNotificationChannel() {
        return this.producerNotificationChannel;
    }
    /**
     * Requirements that must be satisfied before a consumer project can use the service. Each requirement is of the form /; for example 'serviceusage.googleapis.com/billing-enabled'. For Google APIs, a Terms of Service requirement must be included here. Google Cloud APIs must include "serviceusage.googleapis.com/tos/cloud". Other Google APIs should include "serviceusage.googleapis.com/tos/universal". Additional ToS can be included based on the business needs.
     * 
    */
    public List<String> getRequirements() {
        return this.requirements;
    }
    /**
     * A list of usage rules that apply to individual API methods. **NOTE:** All service configuration rules follow "last one wins" order.
     * 
    */
    public List<UsageRuleResponse> getRules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UsageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String producerNotificationChannel;
        private List<String> requirements;
        private List<UsageRuleResponse> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(UsageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.producerNotificationChannel = defaults.producerNotificationChannel;
    	      this.requirements = defaults.requirements;
    	      this.rules = defaults.rules;
        }

        public Builder producerNotificationChannel(String producerNotificationChannel) {
            this.producerNotificationChannel = Objects.requireNonNull(producerNotificationChannel);
            return this;
        }
        public Builder requirements(List<String> requirements) {
            this.requirements = Objects.requireNonNull(requirements);
            return this;
        }
        public Builder requirements(String... requirements) {
            return requirements(List.of(requirements));
        }
        public Builder rules(List<UsageRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(UsageRuleResponse... rules) {
            return rules(List.of(rules));
        }        public UsageResponse build() {
            return new UsageResponse(producerNotificationChannel, requirements, rules);
        }
    }
}
