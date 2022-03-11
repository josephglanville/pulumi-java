// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.monitoring.inputs.UptimeCheckConfigContentMatcherGetArgs;
import io.pulumi.gcp.monitoring.inputs.UptimeCheckConfigHttpCheckGetArgs;
import io.pulumi.gcp.monitoring.inputs.UptimeCheckConfigMonitoredResourceGetArgs;
import io.pulumi.gcp.monitoring.inputs.UptimeCheckConfigResourceGroupGetArgs;
import io.pulumi.gcp.monitoring.inputs.UptimeCheckConfigTcpCheckGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UptimeCheckConfigState extends io.pulumi.resources.ResourceArgs {

    public static final UptimeCheckConfigState Empty = new UptimeCheckConfigState();

    /**
     * The expected content on the page the check is run against. Currently, only the first entry in the list is supported, and other entries will be ignored. The server will look for an exact match of the string in the page response's content. This field is optional and should only be specified if a content match is required.
     * Structure is documented below.
     * 
     */
    @InputImport(name="contentMatchers")
      private final @Nullable Output<List<UptimeCheckConfigContentMatcherGetArgs>> contentMatchers;

    public Output<List<UptimeCheckConfigContentMatcherGetArgs>> getContentMatchers() {
        return this.contentMatchers == null ? Output.empty() : this.contentMatchers;
    }

    /**
     * A human-friendly name for the uptime check configuration. The display name should be unique within a Stackdriver Workspace in order to make it easier to identify; however, uniqueness is not enforced.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * Contains information needed to make an HTTP or HTTPS check.
     * Structure is documented below.
     * 
     */
    @InputImport(name="httpCheck")
      private final @Nullable Output<UptimeCheckConfigHttpCheckGetArgs> httpCheck;

    public Output<UptimeCheckConfigHttpCheckGetArgs> getHttpCheck() {
        return this.httpCheck == null ? Output.empty() : this.httpCheck;
    }

    /**
     * The monitored resource (https://cloud.google.com/monitoring/api/resources) associated with the configuration. The following monitored resource types are supported for uptime checks:  uptime_url  gce_instance  gae_app  aws_ec2_instance  aws_elb_load_balancer
     * Structure is documented below.
     * 
     */
    @InputImport(name="monitoredResource")
      private final @Nullable Output<UptimeCheckConfigMonitoredResourceGetArgs> monitoredResource;

    public Output<UptimeCheckConfigMonitoredResourceGetArgs> getMonitoredResource() {
        return this.monitoredResource == null ? Output.empty() : this.monitoredResource;
    }

    /**
     * A unique resource name for this UptimeCheckConfig. The format is
     * projects/[PROJECT_ID]/uptimeCheckConfigs/[UPTIME_CHECK_ID].
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * How often, in seconds, the uptime check is performed. Currently, the only supported values are 60s (1 minute), 300s (5 minutes), 600s (10 minutes), and 900s (15 minutes). Optional, defaults to 300s.
     * 
     */
    @InputImport(name="period")
      private final @Nullable Output<String> period;

    public Output<String> getPeriod() {
        return this.period == null ? Output.empty() : this.period;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The group resource associated with the configuration.
     * Structure is documented below.
     * 
     */
    @InputImport(name="resourceGroup")
      private final @Nullable Output<UptimeCheckConfigResourceGroupGetArgs> resourceGroup;

    public Output<UptimeCheckConfigResourceGroupGetArgs> getResourceGroup() {
        return this.resourceGroup == null ? Output.empty() : this.resourceGroup;
    }

    /**
     * The list of regions from which the check will be run. Some regions contain one location, and others contain more than one. If this field is specified, enough regions to include a minimum of 3 locations must be provided, or an error message is returned. Not specifying this field will result in uptime checks running from all regions.
     * 
     */
    @InputImport(name="selectedRegions")
      private final @Nullable Output<List<String>> selectedRegions;

    public Output<List<String>> getSelectedRegions() {
        return this.selectedRegions == null ? Output.empty() : this.selectedRegions;
    }

    /**
     * Contains information needed to make a TCP check.
     * Structure is documented below.
     * 
     */
    @InputImport(name="tcpCheck")
      private final @Nullable Output<UptimeCheckConfigTcpCheckGetArgs> tcpCheck;

    public Output<UptimeCheckConfigTcpCheckGetArgs> getTcpCheck() {
        return this.tcpCheck == null ? Output.empty() : this.tcpCheck;
    }

    /**
     * The maximum amount of time to wait for the request to complete (must be between 1 and 60 seconds). Accepted formats https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.Duration
     * 
     */
    @InputImport(name="timeout")
      private final @Nullable Output<String> timeout;

    public Output<String> getTimeout() {
        return this.timeout == null ? Output.empty() : this.timeout;
    }

    /**
     * The id of the uptime check
     * 
     */
    @InputImport(name="uptimeCheckId")
      private final @Nullable Output<String> uptimeCheckId;

    public Output<String> getUptimeCheckId() {
        return this.uptimeCheckId == null ? Output.empty() : this.uptimeCheckId;
    }

    public UptimeCheckConfigState(
        @Nullable Output<List<UptimeCheckConfigContentMatcherGetArgs>> contentMatchers,
        @Nullable Output<String> displayName,
        @Nullable Output<UptimeCheckConfigHttpCheckGetArgs> httpCheck,
        @Nullable Output<UptimeCheckConfigMonitoredResourceGetArgs> monitoredResource,
        @Nullable Output<String> name,
        @Nullable Output<String> period,
        @Nullable Output<String> project,
        @Nullable Output<UptimeCheckConfigResourceGroupGetArgs> resourceGroup,
        @Nullable Output<List<String>> selectedRegions,
        @Nullable Output<UptimeCheckConfigTcpCheckGetArgs> tcpCheck,
        @Nullable Output<String> timeout,
        @Nullable Output<String> uptimeCheckId) {
        this.contentMatchers = contentMatchers;
        this.displayName = displayName;
        this.httpCheck = httpCheck;
        this.monitoredResource = monitoredResource;
        this.name = name;
        this.period = period;
        this.project = project;
        this.resourceGroup = resourceGroup;
        this.selectedRegions = selectedRegions;
        this.tcpCheck = tcpCheck;
        this.timeout = timeout;
        this.uptimeCheckId = uptimeCheckId;
    }

    private UptimeCheckConfigState() {
        this.contentMatchers = Output.empty();
        this.displayName = Output.empty();
        this.httpCheck = Output.empty();
        this.monitoredResource = Output.empty();
        this.name = Output.empty();
        this.period = Output.empty();
        this.project = Output.empty();
        this.resourceGroup = Output.empty();
        this.selectedRegions = Output.empty();
        this.tcpCheck = Output.empty();
        this.timeout = Output.empty();
        this.uptimeCheckId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UptimeCheckConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<UptimeCheckConfigContentMatcherGetArgs>> contentMatchers;
        private @Nullable Output<String> displayName;
        private @Nullable Output<UptimeCheckConfigHttpCheckGetArgs> httpCheck;
        private @Nullable Output<UptimeCheckConfigMonitoredResourceGetArgs> monitoredResource;
        private @Nullable Output<String> name;
        private @Nullable Output<String> period;
        private @Nullable Output<String> project;
        private @Nullable Output<UptimeCheckConfigResourceGroupGetArgs> resourceGroup;
        private @Nullable Output<List<String>> selectedRegions;
        private @Nullable Output<UptimeCheckConfigTcpCheckGetArgs> tcpCheck;
        private @Nullable Output<String> timeout;
        private @Nullable Output<String> uptimeCheckId;

        public Builder() {
    	      // Empty
        }

        public Builder(UptimeCheckConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentMatchers = defaults.contentMatchers;
    	      this.displayName = defaults.displayName;
    	      this.httpCheck = defaults.httpCheck;
    	      this.monitoredResource = defaults.monitoredResource;
    	      this.name = defaults.name;
    	      this.period = defaults.period;
    	      this.project = defaults.project;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.selectedRegions = defaults.selectedRegions;
    	      this.tcpCheck = defaults.tcpCheck;
    	      this.timeout = defaults.timeout;
    	      this.uptimeCheckId = defaults.uptimeCheckId;
        }

        public Builder contentMatchers(@Nullable Output<List<UptimeCheckConfigContentMatcherGetArgs>> contentMatchers) {
            this.contentMatchers = contentMatchers;
            return this;
        }

        public Builder contentMatchers(@Nullable List<UptimeCheckConfigContentMatcherGetArgs> contentMatchers) {
            this.contentMatchers = Output.ofNullable(contentMatchers);
            return this;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }

        public Builder httpCheck(@Nullable Output<UptimeCheckConfigHttpCheckGetArgs> httpCheck) {
            this.httpCheck = httpCheck;
            return this;
        }

        public Builder httpCheck(@Nullable UptimeCheckConfigHttpCheckGetArgs httpCheck) {
            this.httpCheck = Output.ofNullable(httpCheck);
            return this;
        }

        public Builder monitoredResource(@Nullable Output<UptimeCheckConfigMonitoredResourceGetArgs> monitoredResource) {
            this.monitoredResource = monitoredResource;
            return this;
        }

        public Builder monitoredResource(@Nullable UptimeCheckConfigMonitoredResourceGetArgs monitoredResource) {
            this.monitoredResource = Output.ofNullable(monitoredResource);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder period(@Nullable Output<String> period) {
            this.period = period;
            return this;
        }

        public Builder period(@Nullable String period) {
            this.period = Output.ofNullable(period);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder resourceGroup(@Nullable Output<UptimeCheckConfigResourceGroupGetArgs> resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }

        public Builder resourceGroup(@Nullable UptimeCheckConfigResourceGroupGetArgs resourceGroup) {
            this.resourceGroup = Output.ofNullable(resourceGroup);
            return this;
        }

        public Builder selectedRegions(@Nullable Output<List<String>> selectedRegions) {
            this.selectedRegions = selectedRegions;
            return this;
        }

        public Builder selectedRegions(@Nullable List<String> selectedRegions) {
            this.selectedRegions = Output.ofNullable(selectedRegions);
            return this;
        }

        public Builder tcpCheck(@Nullable Output<UptimeCheckConfigTcpCheckGetArgs> tcpCheck) {
            this.tcpCheck = tcpCheck;
            return this;
        }

        public Builder tcpCheck(@Nullable UptimeCheckConfigTcpCheckGetArgs tcpCheck) {
            this.tcpCheck = Output.ofNullable(tcpCheck);
            return this;
        }

        public Builder timeout(@Nullable Output<String> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder timeout(@Nullable String timeout) {
            this.timeout = Output.ofNullable(timeout);
            return this;
        }

        public Builder uptimeCheckId(@Nullable Output<String> uptimeCheckId) {
            this.uptimeCheckId = uptimeCheckId;
            return this;
        }

        public Builder uptimeCheckId(@Nullable String uptimeCheckId) {
            this.uptimeCheckId = Output.ofNullable(uptimeCheckId);
            return this;
        }
        public UptimeCheckConfigState build() {
            return new UptimeCheckConfigState(contentMatchers, displayName, httpCheck, monitoredResource, name, period, project, resourceGroup, selectedRegions, tcpCheck, timeout, uptimeCheckId);
        }
    }
}
