// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Oce.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceState extends com.pulumi.resources.ResourceArgs {

    public static final InstanceState Empty = new InstanceState();

    /**
     * (Updatable) a list of add-on features for the ocm instance
     * 
     */
    @Import(name="addOnFeatures")
    private @Nullable Output<List<String>> addOnFeatures;

    /**
     * @return (Updatable) a list of add-on features for the ocm instance
     * 
     */
    public Optional<Output<List<String>>> addOnFeatures() {
        return Optional.ofNullable(this.addOnFeatures);
    }

    /**
     * Admin Email for Notification
     * 
     */
    @Import(name="adminEmail")
    private @Nullable Output<String> adminEmail;

    /**
     * @return Admin Email for Notification
     * 
     */
    public Optional<Output<String>> adminEmail() {
        return Optional.ofNullable(this.adminEmail);
    }

    /**
     * (Updatable) Compartment Identifier
     * 
     */
    @Import(name="compartmentId")
    private @Nullable Output<String> compartmentId;

    /**
     * @return (Updatable) Compartment Identifier
     * 
     */
    public Optional<Output<String>> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    /**
     * (Updatable) Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Import(name="definedTags")
    private @Nullable Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> definedTags() {
        return Optional.ofNullable(this.definedTags);
    }

    /**
     * (Updatable) OceInstance description
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return (Updatable) OceInstance description
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Import(name="freeformTags")
    private @Nullable Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> freeformTags() {
        return Optional.ofNullable(this.freeformTags);
    }

    /**
     * Unique GUID identifier that is immutable on creation
     * 
     */
    @Import(name="guid")
    private @Nullable Output<String> guid;

    /**
     * @return Unique GUID identifier that is immutable on creation
     * 
     */
    public Optional<Output<String>> guid() {
        return Optional.ofNullable(this.guid);
    }

    /**
     * Identity Cloud Service access token identifying a stripe and service administrator user
     * 
     */
    @Import(name="idcsAccessToken")
    private @Nullable Output<String> idcsAccessToken;

    /**
     * @return Identity Cloud Service access token identifying a stripe and service administrator user
     * 
     */
    public Optional<Output<String>> idcsAccessToken() {
        return Optional.ofNullable(this.idcsAccessToken);
    }

    /**
     * IDCS Tenancy Identifier
     * 
     */
    @Import(name="idcsTenancy")
    private @Nullable Output<String> idcsTenancy;

    /**
     * @return IDCS Tenancy Identifier
     * 
     */
    public Optional<Output<String>> idcsTenancy() {
        return Optional.ofNullable(this.idcsTenancy);
    }

    /**
     * Flag indicating whether the instance access is private or public
     * 
     */
    @Import(name="instanceAccessType")
    private @Nullable Output<String> instanceAccessType;

    /**
     * @return Flag indicating whether the instance access is private or public
     * 
     */
    public Optional<Output<String>> instanceAccessType() {
        return Optional.ofNullable(this.instanceAccessType);
    }

    /**
     * (Updatable) Flag indicating whether the instance license is new cloud or bring your own license
     * 
     */
    @Import(name="instanceLicenseType")
    private @Nullable Output<String> instanceLicenseType;

    /**
     * @return (Updatable) Flag indicating whether the instance license is new cloud or bring your own license
     * 
     */
    public Optional<Output<String>> instanceLicenseType() {
        return Optional.ofNullable(this.instanceLicenseType);
    }

    /**
     * (Updatable) Instance type based on its usage
     * 
     */
    @Import(name="instanceUsageType")
    private @Nullable Output<String> instanceUsageType;

    /**
     * @return (Updatable) Instance type based on its usage
     * 
     */
    public Optional<Output<String>> instanceUsageType() {
        return Optional.ofNullable(this.instanceUsageType);
    }

    /**
     * Details of the current state of the instance lifecycle
     * 
     */
    @Import(name="lifecycleDetails")
    private @Nullable Output<String> lifecycleDetails;

    /**
     * @return Details of the current state of the instance lifecycle
     * 
     */
    public Optional<Output<String>> lifecycleDetails() {
        return Optional.ofNullable(this.lifecycleDetails);
    }

    /**
     * OceInstance Name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return OceInstance Name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Object Storage Namespace of Tenancy
     * 
     */
    @Import(name="objectStorageNamespace")
    private @Nullable Output<String> objectStorageNamespace;

    /**
     * @return Object Storage Namespace of Tenancy
     * 
     */
    public Optional<Output<String>> objectStorageNamespace() {
        return Optional.ofNullable(this.objectStorageNamespace);
    }

    /**
     * SERVICE data. Example: `{&#34;service&#34;: {&#34;IDCS&#34;: &#34;value&#34;}}`
     * 
     */
    @Import(name="service")
    private @Nullable Output<Map<String,Object>> service;

    /**
     * @return SERVICE data. Example: `{&#34;service&#34;: {&#34;IDCS&#34;: &#34;value&#34;}}`
     * 
     */
    public Optional<Output<Map<String,Object>>> service() {
        return Optional.ofNullable(this.service);
    }

    /**
     * The current state of the instance lifecycle.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The current state of the instance lifecycle.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * An message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * 
     */
    @Import(name="stateMessage")
    private @Nullable Output<String> stateMessage;

    /**
     * @return An message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * 
     */
    public Optional<Output<String>> stateMessage() {
        return Optional.ofNullable(this.stateMessage);
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    @Import(name="systemTags")
    private @Nullable Output<Map<String,Object>> systemTags;

    /**
     * @return Usage of system tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> systemTags() {
        return Optional.ofNullable(this.systemTags);
    }

    /**
     * Tenancy Identifier
     * 
     */
    @Import(name="tenancyId")
    private @Nullable Output<String> tenancyId;

    /**
     * @return Tenancy Identifier
     * 
     */
    public Optional<Output<String>> tenancyId() {
        return Optional.ofNullable(this.tenancyId);
    }

    /**
     * Tenancy Name
     * 
     */
    @Import(name="tenancyName")
    private @Nullable Output<String> tenancyName;

    /**
     * @return Tenancy Name
     * 
     */
    public Optional<Output<String>> tenancyName() {
        return Optional.ofNullable(this.tenancyName);
    }

    /**
     * The time the the OceInstance was created. An RFC3339 formatted datetime string
     * 
     */
    @Import(name="timeCreated")
    private @Nullable Output<String> timeCreated;

    /**
     * @return The time the the OceInstance was created. An RFC3339 formatted datetime string
     * 
     */
    public Optional<Output<String>> timeCreated() {
        return Optional.ofNullable(this.timeCreated);
    }

    /**
     * The time the OceInstance was updated. An RFC3339 formatted datetime string
     * 
     */
    @Import(name="timeUpdated")
    private @Nullable Output<String> timeUpdated;

    /**
     * @return The time the OceInstance was updated. An RFC3339 formatted datetime string
     * 
     */
    public Optional<Output<String>> timeUpdated() {
        return Optional.ofNullable(this.timeUpdated);
    }

    /**
     * Upgrade schedule type representing service to be upgraded immediately whenever latest version is released or delay upgrade of the service to previous released version
     * 
     */
    @Import(name="upgradeSchedule")
    private @Nullable Output<String> upgradeSchedule;

    /**
     * @return Upgrade schedule type representing service to be upgraded immediately whenever latest version is released or delay upgrade of the service to previous released version
     * 
     */
    public Optional<Output<String>> upgradeSchedule() {
        return Optional.ofNullable(this.upgradeSchedule);
    }

    /**
     * (Updatable) Web Application Firewall(WAF) primary domain
     * 
     */
    @Import(name="wafPrimaryDomain")
    private @Nullable Output<String> wafPrimaryDomain;

    /**
     * @return (Updatable) Web Application Firewall(WAF) primary domain
     * 
     */
    public Optional<Output<String>> wafPrimaryDomain() {
        return Optional.ofNullable(this.wafPrimaryDomain);
    }

    private InstanceState() {}

    private InstanceState(InstanceState $) {
        this.addOnFeatures = $.addOnFeatures;
        this.adminEmail = $.adminEmail;
        this.compartmentId = $.compartmentId;
        this.definedTags = $.definedTags;
        this.description = $.description;
        this.freeformTags = $.freeformTags;
        this.guid = $.guid;
        this.idcsAccessToken = $.idcsAccessToken;
        this.idcsTenancy = $.idcsTenancy;
        this.instanceAccessType = $.instanceAccessType;
        this.instanceLicenseType = $.instanceLicenseType;
        this.instanceUsageType = $.instanceUsageType;
        this.lifecycleDetails = $.lifecycleDetails;
        this.name = $.name;
        this.objectStorageNamespace = $.objectStorageNamespace;
        this.service = $.service;
        this.state = $.state;
        this.stateMessage = $.stateMessage;
        this.systemTags = $.systemTags;
        this.tenancyId = $.tenancyId;
        this.tenancyName = $.tenancyName;
        this.timeCreated = $.timeCreated;
        this.timeUpdated = $.timeUpdated;
        this.upgradeSchedule = $.upgradeSchedule;
        this.wafPrimaryDomain = $.wafPrimaryDomain;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceState $;

        public Builder() {
            $ = new InstanceState();
        }

        public Builder(InstanceState defaults) {
            $ = new InstanceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param addOnFeatures (Updatable) a list of add-on features for the ocm instance
         * 
         * @return builder
         * 
         */
        public Builder addOnFeatures(@Nullable Output<List<String>> addOnFeatures) {
            $.addOnFeatures = addOnFeatures;
            return this;
        }

        /**
         * @param addOnFeatures (Updatable) a list of add-on features for the ocm instance
         * 
         * @return builder
         * 
         */
        public Builder addOnFeatures(List<String> addOnFeatures) {
            return addOnFeatures(Output.of(addOnFeatures));
        }

        /**
         * @param addOnFeatures (Updatable) a list of add-on features for the ocm instance
         * 
         * @return builder
         * 
         */
        public Builder addOnFeatures(String... addOnFeatures) {
            return addOnFeatures(List.of(addOnFeatures));
        }

        /**
         * @param adminEmail Admin Email for Notification
         * 
         * @return builder
         * 
         */
        public Builder adminEmail(@Nullable Output<String> adminEmail) {
            $.adminEmail = adminEmail;
            return this;
        }

        /**
         * @param adminEmail Admin Email for Notification
         * 
         * @return builder
         * 
         */
        public Builder adminEmail(String adminEmail) {
            return adminEmail(Output.of(adminEmail));
        }

        /**
         * @param compartmentId (Updatable) Compartment Identifier
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId (Updatable) Compartment Identifier
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param definedTags (Updatable) Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(@Nullable Output<Map<String,Object>> definedTags) {
            $.definedTags = definedTags;
            return this;
        }

        /**
         * @param definedTags (Updatable) Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(Map<String,Object> definedTags) {
            return definedTags(Output.of(definedTags));
        }

        /**
         * @param description (Updatable) OceInstance description
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description (Updatable) OceInstance description
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param freeformTags (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(@Nullable Output<Map<String,Object>> freeformTags) {
            $.freeformTags = freeformTags;
            return this;
        }

        /**
         * @param freeformTags (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(Map<String,Object> freeformTags) {
            return freeformTags(Output.of(freeformTags));
        }

        /**
         * @param guid Unique GUID identifier that is immutable on creation
         * 
         * @return builder
         * 
         */
        public Builder guid(@Nullable Output<String> guid) {
            $.guid = guid;
            return this;
        }

        /**
         * @param guid Unique GUID identifier that is immutable on creation
         * 
         * @return builder
         * 
         */
        public Builder guid(String guid) {
            return guid(Output.of(guid));
        }

        /**
         * @param idcsAccessToken Identity Cloud Service access token identifying a stripe and service administrator user
         * 
         * @return builder
         * 
         */
        public Builder idcsAccessToken(@Nullable Output<String> idcsAccessToken) {
            $.idcsAccessToken = idcsAccessToken;
            return this;
        }

        /**
         * @param idcsAccessToken Identity Cloud Service access token identifying a stripe and service administrator user
         * 
         * @return builder
         * 
         */
        public Builder idcsAccessToken(String idcsAccessToken) {
            return idcsAccessToken(Output.of(idcsAccessToken));
        }

        /**
         * @param idcsTenancy IDCS Tenancy Identifier
         * 
         * @return builder
         * 
         */
        public Builder idcsTenancy(@Nullable Output<String> idcsTenancy) {
            $.idcsTenancy = idcsTenancy;
            return this;
        }

        /**
         * @param idcsTenancy IDCS Tenancy Identifier
         * 
         * @return builder
         * 
         */
        public Builder idcsTenancy(String idcsTenancy) {
            return idcsTenancy(Output.of(idcsTenancy));
        }

        /**
         * @param instanceAccessType Flag indicating whether the instance access is private or public
         * 
         * @return builder
         * 
         */
        public Builder instanceAccessType(@Nullable Output<String> instanceAccessType) {
            $.instanceAccessType = instanceAccessType;
            return this;
        }

        /**
         * @param instanceAccessType Flag indicating whether the instance access is private or public
         * 
         * @return builder
         * 
         */
        public Builder instanceAccessType(String instanceAccessType) {
            return instanceAccessType(Output.of(instanceAccessType));
        }

        /**
         * @param instanceLicenseType (Updatable) Flag indicating whether the instance license is new cloud or bring your own license
         * 
         * @return builder
         * 
         */
        public Builder instanceLicenseType(@Nullable Output<String> instanceLicenseType) {
            $.instanceLicenseType = instanceLicenseType;
            return this;
        }

        /**
         * @param instanceLicenseType (Updatable) Flag indicating whether the instance license is new cloud or bring your own license
         * 
         * @return builder
         * 
         */
        public Builder instanceLicenseType(String instanceLicenseType) {
            return instanceLicenseType(Output.of(instanceLicenseType));
        }

        /**
         * @param instanceUsageType (Updatable) Instance type based on its usage
         * 
         * @return builder
         * 
         */
        public Builder instanceUsageType(@Nullable Output<String> instanceUsageType) {
            $.instanceUsageType = instanceUsageType;
            return this;
        }

        /**
         * @param instanceUsageType (Updatable) Instance type based on its usage
         * 
         * @return builder
         * 
         */
        public Builder instanceUsageType(String instanceUsageType) {
            return instanceUsageType(Output.of(instanceUsageType));
        }

        /**
         * @param lifecycleDetails Details of the current state of the instance lifecycle
         * 
         * @return builder
         * 
         */
        public Builder lifecycleDetails(@Nullable Output<String> lifecycleDetails) {
            $.lifecycleDetails = lifecycleDetails;
            return this;
        }

        /**
         * @param lifecycleDetails Details of the current state of the instance lifecycle
         * 
         * @return builder
         * 
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            return lifecycleDetails(Output.of(lifecycleDetails));
        }

        /**
         * @param name OceInstance Name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name OceInstance Name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param objectStorageNamespace Object Storage Namespace of Tenancy
         * 
         * @return builder
         * 
         */
        public Builder objectStorageNamespace(@Nullable Output<String> objectStorageNamespace) {
            $.objectStorageNamespace = objectStorageNamespace;
            return this;
        }

        /**
         * @param objectStorageNamespace Object Storage Namespace of Tenancy
         * 
         * @return builder
         * 
         */
        public Builder objectStorageNamespace(String objectStorageNamespace) {
            return objectStorageNamespace(Output.of(objectStorageNamespace));
        }

        /**
         * @param service SERVICE data. Example: `{&#34;service&#34;: {&#34;IDCS&#34;: &#34;value&#34;}}`
         * 
         * @return builder
         * 
         */
        public Builder service(@Nullable Output<Map<String,Object>> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service SERVICE data. Example: `{&#34;service&#34;: {&#34;IDCS&#34;: &#34;value&#34;}}`
         * 
         * @return builder
         * 
         */
        public Builder service(Map<String,Object> service) {
            return service(Output.of(service));
        }

        /**
         * @param state The current state of the instance lifecycle.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The current state of the instance lifecycle.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param stateMessage An message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         * 
         * @return builder
         * 
         */
        public Builder stateMessage(@Nullable Output<String> stateMessage) {
            $.stateMessage = stateMessage;
            return this;
        }

        /**
         * @param stateMessage An message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         * 
         * @return builder
         * 
         */
        public Builder stateMessage(String stateMessage) {
            return stateMessage(Output.of(stateMessage));
        }

        /**
         * @param systemTags Usage of system tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder systemTags(@Nullable Output<Map<String,Object>> systemTags) {
            $.systemTags = systemTags;
            return this;
        }

        /**
         * @param systemTags Usage of system tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder systemTags(Map<String,Object> systemTags) {
            return systemTags(Output.of(systemTags));
        }

        /**
         * @param tenancyId Tenancy Identifier
         * 
         * @return builder
         * 
         */
        public Builder tenancyId(@Nullable Output<String> tenancyId) {
            $.tenancyId = tenancyId;
            return this;
        }

        /**
         * @param tenancyId Tenancy Identifier
         * 
         * @return builder
         * 
         */
        public Builder tenancyId(String tenancyId) {
            return tenancyId(Output.of(tenancyId));
        }

        /**
         * @param tenancyName Tenancy Name
         * 
         * @return builder
         * 
         */
        public Builder tenancyName(@Nullable Output<String> tenancyName) {
            $.tenancyName = tenancyName;
            return this;
        }

        /**
         * @param tenancyName Tenancy Name
         * 
         * @return builder
         * 
         */
        public Builder tenancyName(String tenancyName) {
            return tenancyName(Output.of(tenancyName));
        }

        /**
         * @param timeCreated The time the the OceInstance was created. An RFC3339 formatted datetime string
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(@Nullable Output<String> timeCreated) {
            $.timeCreated = timeCreated;
            return this;
        }

        /**
         * @param timeCreated The time the the OceInstance was created. An RFC3339 formatted datetime string
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(String timeCreated) {
            return timeCreated(Output.of(timeCreated));
        }

        /**
         * @param timeUpdated The time the OceInstance was updated. An RFC3339 formatted datetime string
         * 
         * @return builder
         * 
         */
        public Builder timeUpdated(@Nullable Output<String> timeUpdated) {
            $.timeUpdated = timeUpdated;
            return this;
        }

        /**
         * @param timeUpdated The time the OceInstance was updated. An RFC3339 formatted datetime string
         * 
         * @return builder
         * 
         */
        public Builder timeUpdated(String timeUpdated) {
            return timeUpdated(Output.of(timeUpdated));
        }

        /**
         * @param upgradeSchedule Upgrade schedule type representing service to be upgraded immediately whenever latest version is released or delay upgrade of the service to previous released version
         * 
         * @return builder
         * 
         */
        public Builder upgradeSchedule(@Nullable Output<String> upgradeSchedule) {
            $.upgradeSchedule = upgradeSchedule;
            return this;
        }

        /**
         * @param upgradeSchedule Upgrade schedule type representing service to be upgraded immediately whenever latest version is released or delay upgrade of the service to previous released version
         * 
         * @return builder
         * 
         */
        public Builder upgradeSchedule(String upgradeSchedule) {
            return upgradeSchedule(Output.of(upgradeSchedule));
        }

        /**
         * @param wafPrimaryDomain (Updatable) Web Application Firewall(WAF) primary domain
         * 
         * @return builder
         * 
         */
        public Builder wafPrimaryDomain(@Nullable Output<String> wafPrimaryDomain) {
            $.wafPrimaryDomain = wafPrimaryDomain;
            return this;
        }

        /**
         * @param wafPrimaryDomain (Updatable) Web Application Firewall(WAF) primary domain
         * 
         * @return builder
         * 
         */
        public Builder wafPrimaryDomain(String wafPrimaryDomain) {
            return wafPrimaryDomain(Output.of(wafPrimaryDomain));
        }

        public InstanceState build() {
            return $;
        }
    }

}
