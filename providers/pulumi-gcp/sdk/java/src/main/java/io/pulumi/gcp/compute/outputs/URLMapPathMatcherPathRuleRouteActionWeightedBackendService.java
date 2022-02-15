// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderAction;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class URLMapPathMatcherPathRuleRouteActionWeightedBackendService {
    private final String backendService;
    private final @Nullable URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderAction headerAction;
    private final Integer weight;

    @OutputCustomType.Constructor({"backendService","headerAction","weight"})
    private URLMapPathMatcherPathRuleRouteActionWeightedBackendService(
        String backendService,
        @Nullable URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderAction headerAction,
        Integer weight) {
        this.backendService = Objects.requireNonNull(backendService);
        this.headerAction = headerAction;
        this.weight = Objects.requireNonNull(weight);
    }

    public String getBackendService() {
        return this.backendService;
    }
    public Optional<URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderAction> getHeaderAction() {
        return Optional.ofNullable(this.headerAction);
    }
    public Integer getWeight() {
        return this.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherPathRuleRouteActionWeightedBackendService defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backendService;
        private @Nullable URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderAction headerAction;
        private Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherPathRuleRouteActionWeightedBackendService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendService = defaults.backendService;
    	      this.headerAction = defaults.headerAction;
    	      this.weight = defaults.weight;
        }

        public Builder setBackendService(String backendService) {
            this.backendService = Objects.requireNonNull(backendService);
            return this;
        }

        public Builder setHeaderAction(@Nullable URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderAction headerAction) {
            this.headerAction = headerAction;
            return this;
        }

        public Builder setWeight(Integer weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }

        public URLMapPathMatcherPathRuleRouteActionWeightedBackendService build() {
            return new URLMapPathMatcherPathRuleRouteActionWeightedBackendService(backendService, headerAction, weight);
        }
    }
}