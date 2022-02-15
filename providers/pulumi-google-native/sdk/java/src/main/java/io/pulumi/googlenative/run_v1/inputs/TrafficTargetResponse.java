// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class TrafficTargetResponse extends io.pulumi.resources.InvokeArgs {

    public static final TrafficTargetResponse Empty = new TrafficTargetResponse();

    @InputImport(name="configurationName", required=true)
    private final String configurationName;

    public String getConfigurationName() {
        return this.configurationName;
    }

    @InputImport(name="latestRevision", required=true)
    private final Boolean latestRevision;

    public Boolean getLatestRevision() {
        return this.latestRevision;
    }

    @InputImport(name="percent", required=true)
    private final Integer percent;

    public Integer getPercent() {
        return this.percent;
    }

    @InputImport(name="revisionName", required=true)
    private final String revisionName;

    public String getRevisionName() {
        return this.revisionName;
    }

    @InputImport(name="tag", required=true)
    private final String tag;

    public String getTag() {
        return this.tag;
    }

    @InputImport(name="url", required=true)
    private final String url;

    public String getUrl() {
        return this.url;
    }

    public TrafficTargetResponse(
        String configurationName,
        Boolean latestRevision,
        Integer percent,
        String revisionName,
        String tag,
        String url) {
        this.configurationName = Objects.requireNonNull(configurationName, "expected parameter 'configurationName' to be non-null");
        this.latestRevision = Objects.requireNonNull(latestRevision, "expected parameter 'latestRevision' to be non-null");
        this.percent = Objects.requireNonNull(percent, "expected parameter 'percent' to be non-null");
        this.revisionName = Objects.requireNonNull(revisionName, "expected parameter 'revisionName' to be non-null");
        this.tag = Objects.requireNonNull(tag, "expected parameter 'tag' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private TrafficTargetResponse() {
        this.configurationName = null;
        this.latestRevision = null;
        this.percent = null;
        this.revisionName = null;
        this.tag = null;
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrafficTargetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String configurationName;
        private Boolean latestRevision;
        private Integer percent;
        private String revisionName;
        private String tag;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(TrafficTargetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationName = defaults.configurationName;
    	      this.latestRevision = defaults.latestRevision;
    	      this.percent = defaults.percent;
    	      this.revisionName = defaults.revisionName;
    	      this.tag = defaults.tag;
    	      this.url = defaults.url;
        }

        public Builder setConfigurationName(String configurationName) {
            this.configurationName = Objects.requireNonNull(configurationName);
            return this;
        }

        public Builder setLatestRevision(Boolean latestRevision) {
            this.latestRevision = Objects.requireNonNull(latestRevision);
            return this;
        }

        public Builder setPercent(Integer percent) {
            this.percent = Objects.requireNonNull(percent);
            return this;
        }

        public Builder setRevisionName(String revisionName) {
            this.revisionName = Objects.requireNonNull(revisionName);
            return this;
        }

        public Builder setTag(String tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public TrafficTargetResponse build() {
            return new TrafficTargetResponse(configurationName, latestRevision, percent, revisionName, tag, url);
        }
    }
}