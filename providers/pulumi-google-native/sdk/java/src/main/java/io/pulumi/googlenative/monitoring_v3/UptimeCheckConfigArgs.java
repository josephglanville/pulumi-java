// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.monitoring_v3.enums.UptimeCheckConfigCheckerType;
import io.pulumi.googlenative.monitoring_v3.enums.UptimeCheckConfigSelectedRegionsItem;
import io.pulumi.googlenative.monitoring_v3.inputs.ContentMatcherArgs;
import io.pulumi.googlenative.monitoring_v3.inputs.HttpCheckArgs;
import io.pulumi.googlenative.monitoring_v3.inputs.InternalCheckerArgs;
import io.pulumi.googlenative.monitoring_v3.inputs.MonitoredResourceArgs;
import io.pulumi.googlenative.monitoring_v3.inputs.ResourceGroupArgs;
import io.pulumi.googlenative.monitoring_v3.inputs.TcpCheckArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UptimeCheckConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final UptimeCheckConfigArgs Empty = new UptimeCheckConfigArgs();

    /**
     * The type of checkers to use to execute the Uptime check.
     * 
     */
    @Import(name="checkerType")
      private final @Nullable Output<UptimeCheckConfigCheckerType> checkerType;

    public Output<UptimeCheckConfigCheckerType> getCheckerType() {
        return this.checkerType == null ? Output.empty() : this.checkerType;
    }

    /**
     * The content that is expected to appear in the data returned by the target server against which the check is run. Currently, only the first entry in the content_matchers list is supported, and additional entries will be ignored. This field is optional and should only be specified if a content match is required as part of the/ Uptime check.
     * 
     */
    @Import(name="contentMatchers")
      private final @Nullable Output<List<ContentMatcherArgs>> contentMatchers;

    public Output<List<ContentMatcherArgs>> getContentMatchers() {
        return this.contentMatchers == null ? Output.empty() : this.contentMatchers;
    }

    /**
     * A human-friendly name for the Uptime check configuration. The display name should be unique within a Stackdriver Workspace in order to make it easier to identify; however, uniqueness is not enforced. Required.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * Contains information needed to make an HTTP or HTTPS check.
     * 
     */
    @Import(name="httpCheck")
      private final @Nullable Output<HttpCheckArgs> httpCheck;

    public Output<HttpCheckArgs> getHttpCheck() {
        return this.httpCheck == null ? Output.empty() : this.httpCheck;
    }

    /**
     * The internal checkers that this check will egress from. If is_internal is true and this list is empty, the check will egress from all the InternalCheckers configured for the project that owns this UptimeCheckConfig.
     * 
     */
    @Import(name="internalCheckers")
      private final @Nullable Output<List<InternalCheckerArgs>> internalCheckers;

    public Output<List<InternalCheckerArgs>> getInternalCheckers() {
        return this.internalCheckers == null ? Output.empty() : this.internalCheckers;
    }

    /**
     * If this is true, then checks are made only from the 'internal_checkers'. If it is false, then checks are made only from the 'selected_regions'. It is an error to provide 'selected_regions' when is_internal is true, or to provide 'internal_checkers' when is_internal is false.
     * 
     */
    @Import(name="isInternal")
      private final @Nullable Output<Boolean> isInternal;

    public Output<Boolean> getIsInternal() {
        return this.isInternal == null ? Output.empty() : this.isInternal;
    }

    /**
     * The monitored resource (https://cloud.google.com/monitoring/api/resources) associated with the configuration. The following monitored resource types are valid for this field: uptime_url, gce_instance, gae_app, aws_ec2_instance, aws_elb_load_balancer k8s_service
     * 
     */
    @Import(name="monitoredResource")
      private final @Nullable Output<MonitoredResourceArgs> monitoredResource;

    public Output<MonitoredResourceArgs> getMonitoredResource() {
        return this.monitoredResource == null ? Output.empty() : this.monitoredResource;
    }

    /**
     * A unique resource name for this Uptime check configuration. The format is: projects/[PROJECT_ID_OR_NUMBER]/uptimeCheckConfigs/[UPTIME_CHECK_ID] [PROJECT_ID_OR_NUMBER] is the Workspace host project associated with the Uptime check.This field should be omitted when creating the Uptime check configuration; on create, the resource name is assigned by the server and included in the response.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * How often, in seconds, the Uptime check is performed. Currently, the only supported values are 60s (1 minute), 300s (5 minutes), 600s (10 minutes), and 900s (15 minutes). Optional, defaults to 60s.
     * 
     */
    @Import(name="period")
      private final @Nullable Output<String> period;

    public Output<String> getPeriod() {
        return this.period == null ? Output.empty() : this.period;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The group resource associated with the configuration.
     * 
     */
    @Import(name="resourceGroup")
      private final @Nullable Output<ResourceGroupArgs> resourceGroup;

    public Output<ResourceGroupArgs> getResourceGroup() {
        return this.resourceGroup == null ? Output.empty() : this.resourceGroup;
    }

    /**
     * The list of regions from which the check will be run. Some regions contain one location, and others contain more than one. If this field is specified, enough regions must be provided to include a minimum of 3 locations. Not specifying this field will result in Uptime checks running from all available regions.
     * 
     */
    @Import(name="selectedRegions")
      private final @Nullable Output<List<UptimeCheckConfigSelectedRegionsItem>> selectedRegions;

    public Output<List<UptimeCheckConfigSelectedRegionsItem>> getSelectedRegions() {
        return this.selectedRegions == null ? Output.empty() : this.selectedRegions;
    }

    /**
     * Contains information needed to make a TCP check.
     * 
     */
    @Import(name="tcpCheck")
      private final @Nullable Output<TcpCheckArgs> tcpCheck;

    public Output<TcpCheckArgs> getTcpCheck() {
        return this.tcpCheck == null ? Output.empty() : this.tcpCheck;
    }

    /**
     * The maximum amount of time to wait for the request to complete (must be between 1 and 60 seconds). Required.
     * 
     */
    @Import(name="timeout")
      private final @Nullable Output<String> timeout;

    public Output<String> getTimeout() {
        return this.timeout == null ? Output.empty() : this.timeout;
    }

    public UptimeCheckConfigArgs(
        @Nullable Output<UptimeCheckConfigCheckerType> checkerType,
        @Nullable Output<List<ContentMatcherArgs>> contentMatchers,
        @Nullable Output<String> displayName,
        @Nullable Output<HttpCheckArgs> httpCheck,
        @Nullable Output<List<InternalCheckerArgs>> internalCheckers,
        @Nullable Output<Boolean> isInternal,
        @Nullable Output<MonitoredResourceArgs> monitoredResource,
        @Nullable Output<String> name,
        @Nullable Output<String> period,
        @Nullable Output<String> project,
        @Nullable Output<ResourceGroupArgs> resourceGroup,
        @Nullable Output<List<UptimeCheckConfigSelectedRegionsItem>> selectedRegions,
        @Nullable Output<TcpCheckArgs> tcpCheck,
        @Nullable Output<String> timeout) {
        this.checkerType = checkerType;
        this.contentMatchers = contentMatchers;
        this.displayName = displayName;
        this.httpCheck = httpCheck;
        this.internalCheckers = internalCheckers;
        this.isInternal = isInternal;
        this.monitoredResource = monitoredResource;
        this.name = name;
        this.period = period;
        this.project = project;
        this.resourceGroup = resourceGroup;
        this.selectedRegions = selectedRegions;
        this.tcpCheck = tcpCheck;
        this.timeout = timeout;
    }

    private UptimeCheckConfigArgs() {
        this.checkerType = Output.empty();
        this.contentMatchers = Output.empty();
        this.displayName = Output.empty();
        this.httpCheck = Output.empty();
        this.internalCheckers = Output.empty();
        this.isInternal = Output.empty();
        this.monitoredResource = Output.empty();
        this.name = Output.empty();
        this.period = Output.empty();
        this.project = Output.empty();
        this.resourceGroup = Output.empty();
        this.selectedRegions = Output.empty();
        this.tcpCheck = Output.empty();
        this.timeout = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UptimeCheckConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<UptimeCheckConfigCheckerType> checkerType;
        private @Nullable Output<List<ContentMatcherArgs>> contentMatchers;
        private @Nullable Output<String> displayName;
        private @Nullable Output<HttpCheckArgs> httpCheck;
        private @Nullable Output<List<InternalCheckerArgs>> internalCheckers;
        private @Nullable Output<Boolean> isInternal;
        private @Nullable Output<MonitoredResourceArgs> monitoredResource;
        private @Nullable Output<String> name;
        private @Nullable Output<String> period;
        private @Nullable Output<String> project;
        private @Nullable Output<ResourceGroupArgs> resourceGroup;
        private @Nullable Output<List<UptimeCheckConfigSelectedRegionsItem>> selectedRegions;
        private @Nullable Output<TcpCheckArgs> tcpCheck;
        private @Nullable Output<String> timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(UptimeCheckConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkerType = defaults.checkerType;
    	      this.contentMatchers = defaults.contentMatchers;
    	      this.displayName = defaults.displayName;
    	      this.httpCheck = defaults.httpCheck;
    	      this.internalCheckers = defaults.internalCheckers;
    	      this.isInternal = defaults.isInternal;
    	      this.monitoredResource = defaults.monitoredResource;
    	      this.name = defaults.name;
    	      this.period = defaults.period;
    	      this.project = defaults.project;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.selectedRegions = defaults.selectedRegions;
    	      this.tcpCheck = defaults.tcpCheck;
    	      this.timeout = defaults.timeout;
        }

        public Builder checkerType(@Nullable Output<UptimeCheckConfigCheckerType> checkerType) {
            this.checkerType = checkerType;
            return this;
        }
        public Builder checkerType(@Nullable UptimeCheckConfigCheckerType checkerType) {
            this.checkerType = Output.ofNullable(checkerType);
            return this;
        }
        public Builder contentMatchers(@Nullable Output<List<ContentMatcherArgs>> contentMatchers) {
            this.contentMatchers = contentMatchers;
            return this;
        }
        public Builder contentMatchers(@Nullable List<ContentMatcherArgs> contentMatchers) {
            this.contentMatchers = Output.ofNullable(contentMatchers);
            return this;
        }
        public Builder contentMatchers(ContentMatcherArgs... contentMatchers) {
            return contentMatchers(List.of(contentMatchers));
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }
        public Builder httpCheck(@Nullable Output<HttpCheckArgs> httpCheck) {
            this.httpCheck = httpCheck;
            return this;
        }
        public Builder httpCheck(@Nullable HttpCheckArgs httpCheck) {
            this.httpCheck = Output.ofNullable(httpCheck);
            return this;
        }
        public Builder internalCheckers(@Nullable Output<List<InternalCheckerArgs>> internalCheckers) {
            this.internalCheckers = internalCheckers;
            return this;
        }
        public Builder internalCheckers(@Nullable List<InternalCheckerArgs> internalCheckers) {
            this.internalCheckers = Output.ofNullable(internalCheckers);
            return this;
        }
        public Builder internalCheckers(InternalCheckerArgs... internalCheckers) {
            return internalCheckers(List.of(internalCheckers));
        }
        public Builder isInternal(@Nullable Output<Boolean> isInternal) {
            this.isInternal = isInternal;
            return this;
        }
        public Builder isInternal(@Nullable Boolean isInternal) {
            this.isInternal = Output.ofNullable(isInternal);
            return this;
        }
        public Builder monitoredResource(@Nullable Output<MonitoredResourceArgs> monitoredResource) {
            this.monitoredResource = monitoredResource;
            return this;
        }
        public Builder monitoredResource(@Nullable MonitoredResourceArgs monitoredResource) {
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
        public Builder resourceGroup(@Nullable Output<ResourceGroupArgs> resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public Builder resourceGroup(@Nullable ResourceGroupArgs resourceGroup) {
            this.resourceGroup = Output.ofNullable(resourceGroup);
            return this;
        }
        public Builder selectedRegions(@Nullable Output<List<UptimeCheckConfigSelectedRegionsItem>> selectedRegions) {
            this.selectedRegions = selectedRegions;
            return this;
        }
        public Builder selectedRegions(@Nullable List<UptimeCheckConfigSelectedRegionsItem> selectedRegions) {
            this.selectedRegions = Output.ofNullable(selectedRegions);
            return this;
        }
        public Builder selectedRegions(UptimeCheckConfigSelectedRegionsItem... selectedRegions) {
            return selectedRegions(List.of(selectedRegions));
        }
        public Builder tcpCheck(@Nullable Output<TcpCheckArgs> tcpCheck) {
            this.tcpCheck = tcpCheck;
            return this;
        }
        public Builder tcpCheck(@Nullable TcpCheckArgs tcpCheck) {
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
        }        public UptimeCheckConfigArgs build() {
            return new UptimeCheckConfigArgs(checkerType, contentMatchers, displayName, httpCheck, internalCheckers, isInternal, monitoredResource, name, period, project, resourceGroup, selectedRegions, tcpCheck, timeout);
        }
    }
}
