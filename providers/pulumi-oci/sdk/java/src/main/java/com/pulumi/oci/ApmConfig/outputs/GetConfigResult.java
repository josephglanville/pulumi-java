// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApmConfig.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.ApmConfig.outputs.GetConfigDimension;
import com.pulumi.oci.ApmConfig.outputs.GetConfigMetric;
import com.pulumi.oci.ApmConfig.outputs.GetConfigRule;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetConfigResult {
    private final String apmDomainId;
    private final String configId;
    /**
     * @return The type of configuration item
     * 
     */
    private final String configType;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return A description of the metric
     * 
     */
    private final String description;
    /**
     * @return A list of dimensions for this metric
     * 
     */
    private final List<GetConfigDimension> dimensions;
    /**
     * @return A user-friendly name that provides a short description this rule.
     * 
     */
    private final String displayName;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a Span Filter. The filterId is mandatory for the creation of MetricGroups. A filterId will be generated when a Span Filter is created.
     * 
     */
    private final String filterId;
    /**
     * @return The string that defines the Span Filter expression.
     * 
     */
    private final String filterText;
    /**
     * @return Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the configuration item. An OCID will be generated when the item is created.
     * 
     */
    private final String id;
    private final List<GetConfigMetric> metrics;
    /**
     * @return The namespace to write the metrics to
     * 
     */
    private final String namespace;
    private final String opcDryRun;
    private final List<GetConfigRule> rules;
    /**
     * @return The time the resource was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2020-02-12T22:47:12.613Z`
     * 
     */
    private final String timeCreated;
    /**
     * @return The time the resource was updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2020-02-13T22:47:12.613Z`
     * 
     */
    private final String timeUpdated;

    @CustomType.Constructor
    private GetConfigResult(
        @CustomType.Parameter("apmDomainId") String apmDomainId,
        @CustomType.Parameter("configId") String configId,
        @CustomType.Parameter("configType") String configType,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("dimensions") List<GetConfigDimension> dimensions,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("filterId") String filterId,
        @CustomType.Parameter("filterText") String filterText,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("metrics") List<GetConfigMetric> metrics,
        @CustomType.Parameter("namespace") String namespace,
        @CustomType.Parameter("opcDryRun") String opcDryRun,
        @CustomType.Parameter("rules") List<GetConfigRule> rules,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeUpdated") String timeUpdated) {
        this.apmDomainId = apmDomainId;
        this.configId = configId;
        this.configType = configType;
        this.definedTags = definedTags;
        this.description = description;
        this.dimensions = dimensions;
        this.displayName = displayName;
        this.filterId = filterId;
        this.filterText = filterText;
        this.freeformTags = freeformTags;
        this.id = id;
        this.metrics = metrics;
        this.namespace = namespace;
        this.opcDryRun = opcDryRun;
        this.rules = rules;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    public String apmDomainId() {
        return this.apmDomainId;
    }
    public String configId() {
        return this.configId;
    }
    /**
     * @return The type of configuration item
     * 
     */
    public String configType() {
        return this.configType;
    }
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return A description of the metric
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return A list of dimensions for this metric
     * 
     */
    public List<GetConfigDimension> dimensions() {
        return this.dimensions;
    }
    /**
     * @return A user-friendly name that provides a short description this rule.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a Span Filter. The filterId is mandatory for the creation of MetricGroups. A filterId will be generated when a Span Filter is created.
     * 
     */
    public String filterId() {
        return this.filterId;
    }
    /**
     * @return The string that defines the Span Filter expression.
     * 
     */
    public String filterText() {
        return this.filterText;
    }
    /**
     * @return Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the configuration item. An OCID will be generated when the item is created.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetConfigMetric> metrics() {
        return this.metrics;
    }
    /**
     * @return The namespace to write the metrics to
     * 
     */
    public String namespace() {
        return this.namespace;
    }
    public String opcDryRun() {
        return this.opcDryRun;
    }
    public List<GetConfigRule> rules() {
        return this.rules;
    }
    /**
     * @return The time the resource was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2020-02-12T22:47:12.613Z`
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The time the resource was updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2020-02-13T22:47:12.613Z`
     * 
     */
    public String timeUpdated() {
        return this.timeUpdated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apmDomainId;
        private String configId;
        private String configType;
        private Map<String,Object> definedTags;
        private String description;
        private List<GetConfigDimension> dimensions;
        private String displayName;
        private String filterId;
        private String filterText;
        private Map<String,Object> freeformTags;
        private String id;
        private List<GetConfigMetric> metrics;
        private String namespace;
        private String opcDryRun;
        private List<GetConfigRule> rules;
        private String timeCreated;
        private String timeUpdated;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apmDomainId = defaults.apmDomainId;
    	      this.configId = defaults.configId;
    	      this.configType = defaults.configType;
    	      this.definedTags = defaults.definedTags;
    	      this.description = defaults.description;
    	      this.dimensions = defaults.dimensions;
    	      this.displayName = defaults.displayName;
    	      this.filterId = defaults.filterId;
    	      this.filterText = defaults.filterText;
    	      this.freeformTags = defaults.freeformTags;
    	      this.id = defaults.id;
    	      this.metrics = defaults.metrics;
    	      this.namespace = defaults.namespace;
    	      this.opcDryRun = defaults.opcDryRun;
    	      this.rules = defaults.rules;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeUpdated = defaults.timeUpdated;
        }

        public Builder apmDomainId(String apmDomainId) {
            this.apmDomainId = Objects.requireNonNull(apmDomainId);
            return this;
        }
        public Builder configId(String configId) {
            this.configId = Objects.requireNonNull(configId);
            return this;
        }
        public Builder configType(String configType) {
            this.configType = Objects.requireNonNull(configType);
            return this;
        }
        public Builder definedTags(Map<String,Object> definedTags) {
            this.definedTags = Objects.requireNonNull(definedTags);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder dimensions(List<GetConfigDimension> dimensions) {
            this.dimensions = Objects.requireNonNull(dimensions);
            return this;
        }
        public Builder dimensions(GetConfigDimension... dimensions) {
            return dimensions(List.of(dimensions));
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder filterId(String filterId) {
            this.filterId = Objects.requireNonNull(filterId);
            return this;
        }
        public Builder filterText(String filterText) {
            this.filterText = Objects.requireNonNull(filterText);
            return this;
        }
        public Builder freeformTags(Map<String,Object> freeformTags) {
            this.freeformTags = Objects.requireNonNull(freeformTags);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder metrics(List<GetConfigMetric> metrics) {
            this.metrics = Objects.requireNonNull(metrics);
            return this;
        }
        public Builder metrics(GetConfigMetric... metrics) {
            return metrics(List.of(metrics));
        }
        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public Builder opcDryRun(String opcDryRun) {
            this.opcDryRun = Objects.requireNonNull(opcDryRun);
            return this;
        }
        public Builder rules(List<GetConfigRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(GetConfigRule... rules) {
            return rules(List.of(rules));
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder timeUpdated(String timeUpdated) {
            this.timeUpdated = Objects.requireNonNull(timeUpdated);
            return this;
        }        public GetConfigResult build() {
            return new GetConfigResult(apmDomainId, configId, configType, definedTags, description, dimensions, displayName, filterId, filterText, freeformTags, id, metrics, namespace, opcDryRun, rules, timeCreated, timeUpdated);
        }
    }
}
