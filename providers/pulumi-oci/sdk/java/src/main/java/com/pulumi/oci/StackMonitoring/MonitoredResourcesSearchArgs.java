// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.StackMonitoring;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MonitoredResourcesSearchArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitoredResourcesSearchArgs Empty = new MonitoredResourcesSearchArgs();

    /**
     * Compartment Identifier [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return Compartment Identifier [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    /**
     * A filter to return resources with host name match
     * 
     */
    @Import(name="hostName")
    private @Nullable Output<String> hostName;

    /**
     * @return A filter to return resources with host name match
     * 
     */
    public Optional<Output<String>> hostName() {
        return Optional.ofNullable(this.hostName);
    }

    /**
     * A filter to return resources with host name pattern
     * 
     */
    @Import(name="hostNameContains")
    private @Nullable Output<String> hostNameContains;

    /**
     * @return A filter to return resources with host name pattern
     * 
     */
    public Optional<Output<String>> hostNameContains() {
        return Optional.ofNullable(this.hostNameContains);
    }

    /**
     * A filter to return resources with matching management agent id.
     * 
     */
    @Import(name="managementAgentId")
    private @Nullable Output<String> managementAgentId;

    /**
     * @return A filter to return resources with matching management agent id.
     * 
     */
    public Optional<Output<String>> managementAgentId() {
        return Optional.ofNullable(this.managementAgentId);
    }

    /**
     * A filter to return resources that match exact resource name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A filter to return resources that match exact resource name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A filter to return resources that match resource name pattern given. The match is not case sensitive.
     * 
     */
    @Import(name="nameContains")
    private @Nullable Output<String> nameContains;

    /**
     * @return A filter to return resources that match resource name pattern given. The match is not case sensitive.
     * 
     */
    public Optional<Output<String>> nameContains() {
        return Optional.ofNullable(this.nameContains);
    }

    /**
     * Criteria based on resource property.
     * 
     */
    @Import(name="propertyEquals")
    private @Nullable Output<Map<String,Object>> propertyEquals;

    /**
     * @return Criteria based on resource property.
     * 
     */
    public Optional<Output<Map<String,Object>>> propertyEquals() {
        return Optional.ofNullable(this.propertyEquals);
    }

    /**
     * Time zone in the form of tz database canonical zone ID.
     * 
     */
    @Import(name="resourceTimeZone")
    private @Nullable Output<String> resourceTimeZone;

    /**
     * @return Time zone in the form of tz database canonical zone ID.
     * 
     */
    public Optional<Output<String>> resourceTimeZone() {
        return Optional.ofNullable(this.resourceTimeZone);
    }

    /**
     * A filter to return resources with matching lifecycle state.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return A filter to return resources with matching lifecycle state.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Search for resources that were created within a specific date range, using this parameter to specify the earliest creation date for the returned list (inclusive). Specifying this parameter without the corresponding `timeCreatedLessThan` parameter will retrieve resources created from the given `timeCreatedGreaterThanOrEqualTo` to the current time, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    @Import(name="timeCreatedGreaterThanOrEqualTo")
    private @Nullable Output<String> timeCreatedGreaterThanOrEqualTo;

    /**
     * @return Search for resources that were created within a specific date range, using this parameter to specify the earliest creation date for the returned list (inclusive). Specifying this parameter without the corresponding `timeCreatedLessThan` parameter will retrieve resources created from the given `timeCreatedGreaterThanOrEqualTo` to the current time, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    public Optional<Output<String>> timeCreatedGreaterThanOrEqualTo() {
        return Optional.ofNullable(this.timeCreatedGreaterThanOrEqualTo);
    }

    /**
     * Search for resources that were created within a specific date range, using this parameter to specify the latest creation date for the returned list (exclusive). Specifying this parameter without the corresponding `timeCreatedGreaterThanOrEqualTo` parameter will retrieve all resources created before the specified end date, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    @Import(name="timeCreatedLessThan")
    private @Nullable Output<String> timeCreatedLessThan;

    /**
     * @return Search for resources that were created within a specific date range, using this parameter to specify the latest creation date for the returned list (exclusive). Specifying this parameter without the corresponding `timeCreatedGreaterThanOrEqualTo` parameter will retrieve all resources created before the specified end date, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    public Optional<Output<String>> timeCreatedLessThan() {
        return Optional.ofNullable(this.timeCreatedLessThan);
    }

    /**
     * Search for resources that were updated within a specific date range, using this parameter to specify the earliest update date for the returned list (inclusive). Specifying this parameter without the corresponding `timeUpdatedLessThan` parameter will retrieve resources updated from the given `timeUpdatedGreaterThanOrEqualTo` to the current time, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    @Import(name="timeUpdatedGreaterThanOrEqualTo")
    private @Nullable Output<String> timeUpdatedGreaterThanOrEqualTo;

    /**
     * @return Search for resources that were updated within a specific date range, using this parameter to specify the earliest update date for the returned list (inclusive). Specifying this parameter without the corresponding `timeUpdatedLessThan` parameter will retrieve resources updated from the given `timeUpdatedGreaterThanOrEqualTo` to the current time, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    public Optional<Output<String>> timeUpdatedGreaterThanOrEqualTo() {
        return Optional.ofNullable(this.timeUpdatedGreaterThanOrEqualTo);
    }

    /**
     * Search for resources that were updated within a specific date range, using this parameter to specify the latest creation date for the returned list (exclusive). Specifying this parameter without the corresponding `timeUpdatedGreaterThanOrEqualTo` parameter will retrieve all resources updated before the specified end date, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    @Import(name="timeUpdatedLessThan")
    private @Nullable Output<String> timeUpdatedLessThan;

    /**
     * @return Search for resources that were updated within a specific date range, using this parameter to specify the latest creation date for the returned list (exclusive). Specifying this parameter without the corresponding `timeUpdatedGreaterThanOrEqualTo` parameter will retrieve all resources updated before the specified end date, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    public Optional<Output<String>> timeUpdatedLessThan() {
        return Optional.ofNullable(this.timeUpdatedLessThan);
    }

    /**
     * A filter to return resources that match resource type
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return A filter to return resources that match resource type
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private MonitoredResourcesSearchArgs() {}

    private MonitoredResourcesSearchArgs(MonitoredResourcesSearchArgs $) {
        this.compartmentId = $.compartmentId;
        this.hostName = $.hostName;
        this.hostNameContains = $.hostNameContains;
        this.managementAgentId = $.managementAgentId;
        this.name = $.name;
        this.nameContains = $.nameContains;
        this.propertyEquals = $.propertyEquals;
        this.resourceTimeZone = $.resourceTimeZone;
        this.state = $.state;
        this.timeCreatedGreaterThanOrEqualTo = $.timeCreatedGreaterThanOrEqualTo;
        this.timeCreatedLessThan = $.timeCreatedLessThan;
        this.timeUpdatedGreaterThanOrEqualTo = $.timeUpdatedGreaterThanOrEqualTo;
        this.timeUpdatedLessThan = $.timeUpdatedLessThan;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitoredResourcesSearchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoredResourcesSearchArgs $;

        public Builder() {
            $ = new MonitoredResourcesSearchArgs();
        }

        public Builder(MonitoredResourcesSearchArgs defaults) {
            $ = new MonitoredResourcesSearchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId Compartment Identifier [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId Compartment Identifier [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param hostName A filter to return resources with host name match
         * 
         * @return builder
         * 
         */
        public Builder hostName(@Nullable Output<String> hostName) {
            $.hostName = hostName;
            return this;
        }

        /**
         * @param hostName A filter to return resources with host name match
         * 
         * @return builder
         * 
         */
        public Builder hostName(String hostName) {
            return hostName(Output.of(hostName));
        }

        /**
         * @param hostNameContains A filter to return resources with host name pattern
         * 
         * @return builder
         * 
         */
        public Builder hostNameContains(@Nullable Output<String> hostNameContains) {
            $.hostNameContains = hostNameContains;
            return this;
        }

        /**
         * @param hostNameContains A filter to return resources with host name pattern
         * 
         * @return builder
         * 
         */
        public Builder hostNameContains(String hostNameContains) {
            return hostNameContains(Output.of(hostNameContains));
        }

        /**
         * @param managementAgentId A filter to return resources with matching management agent id.
         * 
         * @return builder
         * 
         */
        public Builder managementAgentId(@Nullable Output<String> managementAgentId) {
            $.managementAgentId = managementAgentId;
            return this;
        }

        /**
         * @param managementAgentId A filter to return resources with matching management agent id.
         * 
         * @return builder
         * 
         */
        public Builder managementAgentId(String managementAgentId) {
            return managementAgentId(Output.of(managementAgentId));
        }

        /**
         * @param name A filter to return resources that match exact resource name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A filter to return resources that match exact resource name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nameContains A filter to return resources that match resource name pattern given. The match is not case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder nameContains(@Nullable Output<String> nameContains) {
            $.nameContains = nameContains;
            return this;
        }

        /**
         * @param nameContains A filter to return resources that match resource name pattern given. The match is not case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder nameContains(String nameContains) {
            return nameContains(Output.of(nameContains));
        }

        /**
         * @param propertyEquals Criteria based on resource property.
         * 
         * @return builder
         * 
         */
        public Builder propertyEquals(@Nullable Output<Map<String,Object>> propertyEquals) {
            $.propertyEquals = propertyEquals;
            return this;
        }

        /**
         * @param propertyEquals Criteria based on resource property.
         * 
         * @return builder
         * 
         */
        public Builder propertyEquals(Map<String,Object> propertyEquals) {
            return propertyEquals(Output.of(propertyEquals));
        }

        /**
         * @param resourceTimeZone Time zone in the form of tz database canonical zone ID.
         * 
         * @return builder
         * 
         */
        public Builder resourceTimeZone(@Nullable Output<String> resourceTimeZone) {
            $.resourceTimeZone = resourceTimeZone;
            return this;
        }

        /**
         * @param resourceTimeZone Time zone in the form of tz database canonical zone ID.
         * 
         * @return builder
         * 
         */
        public Builder resourceTimeZone(String resourceTimeZone) {
            return resourceTimeZone(Output.of(resourceTimeZone));
        }

        /**
         * @param state A filter to return resources with matching lifecycle state.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state A filter to return resources with matching lifecycle state.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param timeCreatedGreaterThanOrEqualTo Search for resources that were created within a specific date range, using this parameter to specify the earliest creation date for the returned list (inclusive). Specifying this parameter without the corresponding `timeCreatedLessThan` parameter will retrieve resources created from the given `timeCreatedGreaterThanOrEqualTo` to the current time, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
         * 
         * @return builder
         * 
         */
        public Builder timeCreatedGreaterThanOrEqualTo(@Nullable Output<String> timeCreatedGreaterThanOrEqualTo) {
            $.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
            return this;
        }

        /**
         * @param timeCreatedGreaterThanOrEqualTo Search for resources that were created within a specific date range, using this parameter to specify the earliest creation date for the returned list (inclusive). Specifying this parameter without the corresponding `timeCreatedLessThan` parameter will retrieve resources created from the given `timeCreatedGreaterThanOrEqualTo` to the current time, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
         * 
         * @return builder
         * 
         */
        public Builder timeCreatedGreaterThanOrEqualTo(String timeCreatedGreaterThanOrEqualTo) {
            return timeCreatedGreaterThanOrEqualTo(Output.of(timeCreatedGreaterThanOrEqualTo));
        }

        /**
         * @param timeCreatedLessThan Search for resources that were created within a specific date range, using this parameter to specify the latest creation date for the returned list (exclusive). Specifying this parameter without the corresponding `timeCreatedGreaterThanOrEqualTo` parameter will retrieve all resources created before the specified end date, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
         * 
         * @return builder
         * 
         */
        public Builder timeCreatedLessThan(@Nullable Output<String> timeCreatedLessThan) {
            $.timeCreatedLessThan = timeCreatedLessThan;
            return this;
        }

        /**
         * @param timeCreatedLessThan Search for resources that were created within a specific date range, using this parameter to specify the latest creation date for the returned list (exclusive). Specifying this parameter without the corresponding `timeCreatedGreaterThanOrEqualTo` parameter will retrieve all resources created before the specified end date, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
         * 
         * @return builder
         * 
         */
        public Builder timeCreatedLessThan(String timeCreatedLessThan) {
            return timeCreatedLessThan(Output.of(timeCreatedLessThan));
        }

        /**
         * @param timeUpdatedGreaterThanOrEqualTo Search for resources that were updated within a specific date range, using this parameter to specify the earliest update date for the returned list (inclusive). Specifying this parameter without the corresponding `timeUpdatedLessThan` parameter will retrieve resources updated from the given `timeUpdatedGreaterThanOrEqualTo` to the current time, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
         * 
         * @return builder
         * 
         */
        public Builder timeUpdatedGreaterThanOrEqualTo(@Nullable Output<String> timeUpdatedGreaterThanOrEqualTo) {
            $.timeUpdatedGreaterThanOrEqualTo = timeUpdatedGreaterThanOrEqualTo;
            return this;
        }

        /**
         * @param timeUpdatedGreaterThanOrEqualTo Search for resources that were updated within a specific date range, using this parameter to specify the earliest update date for the returned list (inclusive). Specifying this parameter without the corresponding `timeUpdatedLessThan` parameter will retrieve resources updated from the given `timeUpdatedGreaterThanOrEqualTo` to the current time, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
         * 
         * @return builder
         * 
         */
        public Builder timeUpdatedGreaterThanOrEqualTo(String timeUpdatedGreaterThanOrEqualTo) {
            return timeUpdatedGreaterThanOrEqualTo(Output.of(timeUpdatedGreaterThanOrEqualTo));
        }

        /**
         * @param timeUpdatedLessThan Search for resources that were updated within a specific date range, using this parameter to specify the latest creation date for the returned list (exclusive). Specifying this parameter without the corresponding `timeUpdatedGreaterThanOrEqualTo` parameter will retrieve all resources updated before the specified end date, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
         * 
         * @return builder
         * 
         */
        public Builder timeUpdatedLessThan(@Nullable Output<String> timeUpdatedLessThan) {
            $.timeUpdatedLessThan = timeUpdatedLessThan;
            return this;
        }

        /**
         * @param timeUpdatedLessThan Search for resources that were updated within a specific date range, using this parameter to specify the latest creation date for the returned list (exclusive). Specifying this parameter without the corresponding `timeUpdatedGreaterThanOrEqualTo` parameter will retrieve all resources updated before the specified end date, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
         * 
         * @return builder
         * 
         */
        public Builder timeUpdatedLessThan(String timeUpdatedLessThan) {
            return timeUpdatedLessThan(Output.of(timeUpdatedLessThan));
        }

        /**
         * @param type A filter to return resources that match resource type
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type A filter to return resources that match resource type
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public MonitoredResourcesSearchArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
