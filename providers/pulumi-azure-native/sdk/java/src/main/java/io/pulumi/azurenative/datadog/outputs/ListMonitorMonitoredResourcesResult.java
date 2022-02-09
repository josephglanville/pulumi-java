// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datadog.outputs;

import io.pulumi.azurenative.datadog.outputs.MonitoredResourceResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListMonitorMonitoredResourcesResult {
    private final @Nullable String nextLink;
    private final @Nullable List<MonitoredResourceResponse> value;

    @OutputCustomType.Constructor({"nextLink","value"})
    private ListMonitorMonitoredResourcesResult(
        @Nullable String nextLink,
        @Nullable List<MonitoredResourceResponse> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    public Optional<String> getNextLink() {
        return Optional.ofNullable(this.nextLink);
    }
    public List<MonitoredResourceResponse> getValue() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListMonitorMonitoredResourcesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nextLink;
        private @Nullable List<MonitoredResourceResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListMonitorMonitoredResourcesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder setNextLink(@Nullable String nextLink) {
            this.nextLink = nextLink;
            return this;
        }

        public Builder setValue(@Nullable List<MonitoredResourceResponse> value) {
            this.value = value;
            return this;
        }

        public ListMonitorMonitoredResourcesResult build() {
            return new ListMonitorMonitoredResourcesResult(nextLink, value);
        }
    }
}
