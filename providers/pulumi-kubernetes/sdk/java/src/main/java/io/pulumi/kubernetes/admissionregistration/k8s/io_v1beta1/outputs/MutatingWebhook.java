// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.admissionregistration.k8s.io_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.admissionregistration.k8s.io_v1beta1.outputs.RuleWithOperations;
import io.pulumi.kubernetes.admissionregistration.k8s.io_v1beta1.outputs.WebhookClientConfig;
import io.pulumi.kubernetes.meta_v1.outputs.LabelSelector;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MutatingWebhook {
    /**
     * AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy. Default to `['v1beta1']`.
     * 
     */
    private final @Nullable List<String> admissionReviewVersions;
    /**
     * ClientConfig defines how to communicate with the hook. Required
     * 
     */
    private final WebhookClientConfig clientConfig;
    /**
     * FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Ignore.
     * 
     */
    private final @Nullable String failurePolicy;
    /**
     * matchPolicy defines how the "rules" list is used to match incoming requests. Allowed values are "Exact" or "Equivalent".
     * 
     * - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but "rules" only included `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.
     * 
     * - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and "rules" only included `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.
     * 
     * Defaults to "Exact"
     * 
     */
    private final @Nullable String matchPolicy;
    /**
     * The name of the admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where "imagepolicy" is the name of the webhook, and kubernetes.io is the name of the organization. Required.
     * 
     */
    private final String name;
    /**
     * NamespaceSelector decides whether to run the webhook on an object based on whether the namespace for that object matches the selector. If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the webhook.
     * 
     * For example, to run the webhook on any objects whose namespace is not associated with "runlevel" of "0" or "1";  you will set the selector as follows: "namespaceSelector": {
     *   "matchExpressions": [
     *     {
     *       "key": "runlevel",
     *       "operator": "NotIn",
     *       "values": [
     *         "0",
     *         "1"
     *       ]
     *     }
     *   ]
     * }
     * 
     * If instead you want to only run the webhook on any objects whose namespace is associated with the "environment" of "prod" or "staging"; you will set the selector as follows: "namespaceSelector": {
     *   "matchExpressions": [
     *     {
     *       "key": "environment",
     *       "operator": "In",
     *       "values": [
     *         "prod",
     *         "staging"
     *       ]
     *     }
     *   ]
     * }
     * 
     * See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/ for more examples of label selectors.
     * 
     * Default to the empty LabelSelector, which matches everything.
     * 
     */
    private final @Nullable LabelSelector namespaceSelector;
    /**
     * ObjectSelector decides whether to run the webhook based on if the object has matching labels. objectSelector is evaluated against both the oldObject and newObject that would be sent to the webhook, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.
     * 
     */
    private final @Nullable LabelSelector objectSelector;
    /**
     * reinvocationPolicy indicates whether this webhook should be called multiple times as part of a single admission evaluation. Allowed values are "Never" and "IfNeeded".
     * 
     * Never: the webhook will not be called more than once in a single admission evaluation.
     * 
     * IfNeeded: the webhook will be called at least one additional time as part of the admission evaluation if the object being admitted is modified by other admission plugins after the initial webhook call. Webhooks that specify this option *must* be idempotent, able to process objects they previously admitted. Note: * the number of additional invocations is not guaranteed to be exactly one. * if additional invocations result in further modifications to the object, webhooks are not guaranteed to be invoked again. * webhooks that use this option may be reordered to minimize the number of additional invocations. * to validate an object after all mutations are guaranteed complete, use a validating admission webhook instead.
     * 
     * Defaults to "Never".
     * 
     */
    private final @Nullable String reinvocationPolicy;
    /**
     * Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
     * 
     */
    private final @Nullable List<RuleWithOperations> rules;
    /**
     * SideEffects states whether this webhook has side effects. Acceptable values are: Unknown, None, Some, NoneOnDryRun Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission change and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects == Unknown or Some. Defaults to Unknown.
     * 
     */
    private final @Nullable String sideEffects;
    /**
     * TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 30 seconds.
     * 
     */
    private final @Nullable Integer timeoutSeconds;

    @CustomType.Constructor
    private MutatingWebhook(
        @CustomType.Parameter("admissionReviewVersions") @Nullable List<String> admissionReviewVersions,
        @CustomType.Parameter("clientConfig") WebhookClientConfig clientConfig,
        @CustomType.Parameter("failurePolicy") @Nullable String failurePolicy,
        @CustomType.Parameter("matchPolicy") @Nullable String matchPolicy,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("namespaceSelector") @Nullable LabelSelector namespaceSelector,
        @CustomType.Parameter("objectSelector") @Nullable LabelSelector objectSelector,
        @CustomType.Parameter("reinvocationPolicy") @Nullable String reinvocationPolicy,
        @CustomType.Parameter("rules") @Nullable List<RuleWithOperations> rules,
        @CustomType.Parameter("sideEffects") @Nullable String sideEffects,
        @CustomType.Parameter("timeoutSeconds") @Nullable Integer timeoutSeconds) {
        this.admissionReviewVersions = admissionReviewVersions;
        this.clientConfig = clientConfig;
        this.failurePolicy = failurePolicy;
        this.matchPolicy = matchPolicy;
        this.name = name;
        this.namespaceSelector = namespaceSelector;
        this.objectSelector = objectSelector;
        this.reinvocationPolicy = reinvocationPolicy;
        this.rules = rules;
        this.sideEffects = sideEffects;
        this.timeoutSeconds = timeoutSeconds;
    }

    /**
     * AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy. Default to `['v1beta1']`.
     * 
    */
    public List<String> getAdmissionReviewVersions() {
        return this.admissionReviewVersions == null ? List.of() : this.admissionReviewVersions;
    }
    /**
     * ClientConfig defines how to communicate with the hook. Required
     * 
    */
    public WebhookClientConfig getClientConfig() {
        return this.clientConfig;
    }
    /**
     * FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Ignore.
     * 
    */
    public Optional<String> getFailurePolicy() {
        return Optional.ofNullable(this.failurePolicy);
    }
    /**
     * matchPolicy defines how the "rules" list is used to match incoming requests. Allowed values are "Exact" or "Equivalent".
     * 
     * - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but "rules" only included `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.
     * 
     * - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and "rules" only included `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.
     * 
     * Defaults to "Exact"
     * 
    */
    public Optional<String> getMatchPolicy() {
        return Optional.ofNullable(this.matchPolicy);
    }
    /**
     * The name of the admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where "imagepolicy" is the name of the webhook, and kubernetes.io is the name of the organization. Required.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * NamespaceSelector decides whether to run the webhook on an object based on whether the namespace for that object matches the selector. If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the webhook.
     * 
     * For example, to run the webhook on any objects whose namespace is not associated with "runlevel" of "0" or "1";  you will set the selector as follows: "namespaceSelector": {
     *   "matchExpressions": [
     *     {
     *       "key": "runlevel",
     *       "operator": "NotIn",
     *       "values": [
     *         "0",
     *         "1"
     *       ]
     *     }
     *   ]
     * }
     * 
     * If instead you want to only run the webhook on any objects whose namespace is associated with the "environment" of "prod" or "staging"; you will set the selector as follows: "namespaceSelector": {
     *   "matchExpressions": [
     *     {
     *       "key": "environment",
     *       "operator": "In",
     *       "values": [
     *         "prod",
     *         "staging"
     *       ]
     *     }
     *   ]
     * }
     * 
     * See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/ for more examples of label selectors.
     * 
     * Default to the empty LabelSelector, which matches everything.
     * 
    */
    public Optional<LabelSelector> getNamespaceSelector() {
        return Optional.ofNullable(this.namespaceSelector);
    }
    /**
     * ObjectSelector decides whether to run the webhook based on if the object has matching labels. objectSelector is evaluated against both the oldObject and newObject that would be sent to the webhook, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.
     * 
    */
    public Optional<LabelSelector> getObjectSelector() {
        return Optional.ofNullable(this.objectSelector);
    }
    /**
     * reinvocationPolicy indicates whether this webhook should be called multiple times as part of a single admission evaluation. Allowed values are "Never" and "IfNeeded".
     * 
     * Never: the webhook will not be called more than once in a single admission evaluation.
     * 
     * IfNeeded: the webhook will be called at least one additional time as part of the admission evaluation if the object being admitted is modified by other admission plugins after the initial webhook call. Webhooks that specify this option *must* be idempotent, able to process objects they previously admitted. Note: * the number of additional invocations is not guaranteed to be exactly one. * if additional invocations result in further modifications to the object, webhooks are not guaranteed to be invoked again. * webhooks that use this option may be reordered to minimize the number of additional invocations. * to validate an object after all mutations are guaranteed complete, use a validating admission webhook instead.
     * 
     * Defaults to "Never".
     * 
    */
    public Optional<String> getReinvocationPolicy() {
        return Optional.ofNullable(this.reinvocationPolicy);
    }
    /**
     * Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
     * 
    */
    public List<RuleWithOperations> getRules() {
        return this.rules == null ? List.of() : this.rules;
    }
    /**
     * SideEffects states whether this webhook has side effects. Acceptable values are: Unknown, None, Some, NoneOnDryRun Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission change and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects == Unknown or Some. Defaults to Unknown.
     * 
    */
    public Optional<String> getSideEffects() {
        return Optional.ofNullable(this.sideEffects);
    }
    /**
     * TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 30 seconds.
     * 
    */
    public Optional<Integer> getTimeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MutatingWebhook defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> admissionReviewVersions;
        private WebhookClientConfig clientConfig;
        private @Nullable String failurePolicy;
        private @Nullable String matchPolicy;
        private String name;
        private @Nullable LabelSelector namespaceSelector;
        private @Nullable LabelSelector objectSelector;
        private @Nullable String reinvocationPolicy;
        private @Nullable List<RuleWithOperations> rules;
        private @Nullable String sideEffects;
        private @Nullable Integer timeoutSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(MutatingWebhook defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.admissionReviewVersions = defaults.admissionReviewVersions;
    	      this.clientConfig = defaults.clientConfig;
    	      this.failurePolicy = defaults.failurePolicy;
    	      this.matchPolicy = defaults.matchPolicy;
    	      this.name = defaults.name;
    	      this.namespaceSelector = defaults.namespaceSelector;
    	      this.objectSelector = defaults.objectSelector;
    	      this.reinvocationPolicy = defaults.reinvocationPolicy;
    	      this.rules = defaults.rules;
    	      this.sideEffects = defaults.sideEffects;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        public Builder admissionReviewVersions(@Nullable List<String> admissionReviewVersions) {
            this.admissionReviewVersions = admissionReviewVersions;
            return this;
        }
        public Builder admissionReviewVersions(String... admissionReviewVersions) {
            return admissionReviewVersions(List.of(admissionReviewVersions));
        }
        public Builder clientConfig(WebhookClientConfig clientConfig) {
            this.clientConfig = Objects.requireNonNull(clientConfig);
            return this;
        }
        public Builder failurePolicy(@Nullable String failurePolicy) {
            this.failurePolicy = failurePolicy;
            return this;
        }
        public Builder matchPolicy(@Nullable String matchPolicy) {
            this.matchPolicy = matchPolicy;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder namespaceSelector(@Nullable LabelSelector namespaceSelector) {
            this.namespaceSelector = namespaceSelector;
            return this;
        }
        public Builder objectSelector(@Nullable LabelSelector objectSelector) {
            this.objectSelector = objectSelector;
            return this;
        }
        public Builder reinvocationPolicy(@Nullable String reinvocationPolicy) {
            this.reinvocationPolicy = reinvocationPolicy;
            return this;
        }
        public Builder rules(@Nullable List<RuleWithOperations> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(RuleWithOperations... rules) {
            return rules(List.of(rules));
        }
        public Builder sideEffects(@Nullable String sideEffects) {
            this.sideEffects = sideEffects;
            return this;
        }
        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }        public MutatingWebhook build() {
            return new MutatingWebhook(admissionReviewVersions, clientConfig, failurePolicy, matchPolicy, name, namespaceSelector, objectSelector, reinvocationPolicy, rules, sideEffects, timeoutSeconds);
        }
    }
}
