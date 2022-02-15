// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs.WebhookClientConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomResourceConversionArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomResourceConversionArgs Empty = new CustomResourceConversionArgs();

    @InputImport(name="conversionReviewVersions")
    private final @Nullable Input<List<String>> conversionReviewVersions;

    public Input<List<String>> getConversionReviewVersions() {
        return this.conversionReviewVersions == null ? Input.empty() : this.conversionReviewVersions;
    }

    @InputImport(name="strategy", required=true)
    private final Input<String> strategy;

    public Input<String> getStrategy() {
        return this.strategy;
    }

    @InputImport(name="webhookClientConfig")
    private final @Nullable Input<WebhookClientConfigArgs> webhookClientConfig;

    public Input<WebhookClientConfigArgs> getWebhookClientConfig() {
        return this.webhookClientConfig == null ? Input.empty() : this.webhookClientConfig;
    }

    public CustomResourceConversionArgs(
        @Nullable Input<List<String>> conversionReviewVersions,
        Input<String> strategy,
        @Nullable Input<WebhookClientConfigArgs> webhookClientConfig) {
        this.conversionReviewVersions = conversionReviewVersions;
        this.strategy = Objects.requireNonNull(strategy, "expected parameter 'strategy' to be non-null");
        this.webhookClientConfig = webhookClientConfig;
    }

    private CustomResourceConversionArgs() {
        this.conversionReviewVersions = Input.empty();
        this.strategy = Input.empty();
        this.webhookClientConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceConversionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> conversionReviewVersions;
        private Input<String> strategy;
        private @Nullable Input<WebhookClientConfigArgs> webhookClientConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceConversionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conversionReviewVersions = defaults.conversionReviewVersions;
    	      this.strategy = defaults.strategy;
    	      this.webhookClientConfig = defaults.webhookClientConfig;
        }

        public Builder setConversionReviewVersions(@Nullable Input<List<String>> conversionReviewVersions) {
            this.conversionReviewVersions = conversionReviewVersions;
            return this;
        }

        public Builder setConversionReviewVersions(@Nullable List<String> conversionReviewVersions) {
            this.conversionReviewVersions = Input.ofNullable(conversionReviewVersions);
            return this;
        }

        public Builder setStrategy(Input<String> strategy) {
            this.strategy = Objects.requireNonNull(strategy);
            return this;
        }

        public Builder setStrategy(String strategy) {
            this.strategy = Input.of(Objects.requireNonNull(strategy));
            return this;
        }

        public Builder setWebhookClientConfig(@Nullable Input<WebhookClientConfigArgs> webhookClientConfig) {
            this.webhookClientConfig = webhookClientConfig;
            return this;
        }

        public Builder setWebhookClientConfig(@Nullable WebhookClientConfigArgs webhookClientConfig) {
            this.webhookClientConfig = Input.ofNullable(webhookClientConfig);
            return this;
        }

        public CustomResourceConversionArgs build() {
            return new CustomResourceConversionArgs(conversionReviewVersions, strategy, webhookClientConfig);
        }
    }
}