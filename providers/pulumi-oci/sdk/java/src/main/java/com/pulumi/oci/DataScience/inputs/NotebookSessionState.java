// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataScience.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DataScience.inputs.NotebookSessionNotebookSessionConfigDetailsArgs;
import com.pulumi.oci.DataScience.inputs.NotebookSessionNotebookSessionConfigurationDetailsArgs;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotebookSessionState extends com.pulumi.resources.ResourceArgs {

    public static final NotebookSessionState Empty = new NotebookSessionState();

    /**
     * (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the notebook session.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable Output<String> compartmentId;

    /**
     * @return (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the notebook session.
     * 
     */
    public Optional<Output<String>> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the notebook session.
     * 
     */
    @Import(name="createdBy")
    private @Nullable Output<String> createdBy;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the notebook session.
     * 
     */
    public Optional<Output<String>> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }

    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    @Import(name="definedTags")
    private @Nullable Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> definedTags() {
        return Optional.ofNullable(this.definedTags);
    }

    /**
     * (Updatable) A user-friendly display name for the resource. It does not have to be unique and can be modified. Avoid entering confidential information. Example: `My NotebookSession`
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return (Updatable) A user-friendly display name for the resource. It does not have to be unique and can be modified. Avoid entering confidential information. Example: `My NotebookSession`
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    @Import(name="freeformTags")
    private @Nullable Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> freeformTags() {
        return Optional.ofNullable(this.freeformTags);
    }

    /**
     * Details about the state of the notebook session.
     * 
     */
    @Import(name="lifecycleDetails")
    private @Nullable Output<String> lifecycleDetails;

    /**
     * @return Details about the state of the notebook session.
     * 
     */
    public Optional<Output<String>> lifecycleDetails() {
        return Optional.ofNullable(this.lifecycleDetails);
    }

    /**
     * Details for the notebook session configuration.
     * 
     */
    @Import(name="notebookSessionConfigDetails")
    private @Nullable Output<NotebookSessionNotebookSessionConfigDetailsArgs> notebookSessionConfigDetails;

    /**
     * @return Details for the notebook session configuration.
     * 
     */
    public Optional<Output<NotebookSessionNotebookSessionConfigDetailsArgs>> notebookSessionConfigDetails() {
        return Optional.ofNullable(this.notebookSessionConfigDetails);
    }

    /**
     * (Updatable) Details for the notebook session configuration.
     * 
     */
    @Import(name="notebookSessionConfigurationDetails")
    private @Nullable Output<NotebookSessionNotebookSessionConfigurationDetailsArgs> notebookSessionConfigurationDetails;

    /**
     * @return (Updatable) Details for the notebook session configuration.
     * 
     */
    public Optional<Output<NotebookSessionNotebookSessionConfigurationDetailsArgs>> notebookSessionConfigurationDetails() {
        return Optional.ofNullable(this.notebookSessionConfigurationDetails);
    }

    /**
     * The URL to interact with the notebook session.
     * 
     */
    @Import(name="notebookSessionUrl")
    private @Nullable Output<String> notebookSessionUrl;

    /**
     * @return The URL to interact with the notebook session.
     * 
     */
    public Optional<Output<String>> notebookSessionUrl() {
        return Optional.ofNullable(this.notebookSessionUrl);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project to associate with the notebook session.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project to associate with the notebook session.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * The state of the notebook session.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The state of the notebook session.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The date and time the resource was created in the timestamp format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Example: 2019-08-25T21:10:29.41Z
     * 
     */
    @Import(name="timeCreated")
    private @Nullable Output<String> timeCreated;

    /**
     * @return The date and time the resource was created in the timestamp format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Example: 2019-08-25T21:10:29.41Z
     * 
     */
    public Optional<Output<String>> timeCreated() {
        return Optional.ofNullable(this.timeCreated);
    }

    private NotebookSessionState() {}

    private NotebookSessionState(NotebookSessionState $) {
        this.compartmentId = $.compartmentId;
        this.createdBy = $.createdBy;
        this.definedTags = $.definedTags;
        this.displayName = $.displayName;
        this.freeformTags = $.freeformTags;
        this.lifecycleDetails = $.lifecycleDetails;
        this.notebookSessionConfigDetails = $.notebookSessionConfigDetails;
        this.notebookSessionConfigurationDetails = $.notebookSessionConfigurationDetails;
        this.notebookSessionUrl = $.notebookSessionUrl;
        this.projectId = $.projectId;
        this.state = $.state;
        this.timeCreated = $.timeCreated;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotebookSessionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotebookSessionState $;

        public Builder() {
            $ = new NotebookSessionState();
        }

        public Builder(NotebookSessionState defaults) {
            $ = new NotebookSessionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the notebook session.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the notebook session.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param createdBy The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the notebook session.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(@Nullable Output<String> createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        /**
         * @param createdBy The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the notebook session.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(String createdBy) {
            return createdBy(Output.of(createdBy));
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(@Nullable Output<Map<String,Object>> definedTags) {
            $.definedTags = definedTags;
            return this;
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(Map<String,Object> definedTags) {
            return definedTags(Output.of(definedTags));
        }

        /**
         * @param displayName (Updatable) A user-friendly display name for the resource. It does not have to be unique and can be modified. Avoid entering confidential information. Example: `My NotebookSession`
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName (Updatable) A user-friendly display name for the resource. It does not have to be unique and can be modified. Avoid entering confidential information. Example: `My NotebookSession`
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param freeformTags (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(@Nullable Output<Map<String,Object>> freeformTags) {
            $.freeformTags = freeformTags;
            return this;
        }

        /**
         * @param freeformTags (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(Map<String,Object> freeformTags) {
            return freeformTags(Output.of(freeformTags));
        }

        /**
         * @param lifecycleDetails Details about the state of the notebook session.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleDetails(@Nullable Output<String> lifecycleDetails) {
            $.lifecycleDetails = lifecycleDetails;
            return this;
        }

        /**
         * @param lifecycleDetails Details about the state of the notebook session.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            return lifecycleDetails(Output.of(lifecycleDetails));
        }

        /**
         * @param notebookSessionConfigDetails Details for the notebook session configuration.
         * 
         * @return builder
         * 
         */
        public Builder notebookSessionConfigDetails(@Nullable Output<NotebookSessionNotebookSessionConfigDetailsArgs> notebookSessionConfigDetails) {
            $.notebookSessionConfigDetails = notebookSessionConfigDetails;
            return this;
        }

        /**
         * @param notebookSessionConfigDetails Details for the notebook session configuration.
         * 
         * @return builder
         * 
         */
        public Builder notebookSessionConfigDetails(NotebookSessionNotebookSessionConfigDetailsArgs notebookSessionConfigDetails) {
            return notebookSessionConfigDetails(Output.of(notebookSessionConfigDetails));
        }

        /**
         * @param notebookSessionConfigurationDetails (Updatable) Details for the notebook session configuration.
         * 
         * @return builder
         * 
         */
        public Builder notebookSessionConfigurationDetails(@Nullable Output<NotebookSessionNotebookSessionConfigurationDetailsArgs> notebookSessionConfigurationDetails) {
            $.notebookSessionConfigurationDetails = notebookSessionConfigurationDetails;
            return this;
        }

        /**
         * @param notebookSessionConfigurationDetails (Updatable) Details for the notebook session configuration.
         * 
         * @return builder
         * 
         */
        public Builder notebookSessionConfigurationDetails(NotebookSessionNotebookSessionConfigurationDetailsArgs notebookSessionConfigurationDetails) {
            return notebookSessionConfigurationDetails(Output.of(notebookSessionConfigurationDetails));
        }

        /**
         * @param notebookSessionUrl The URL to interact with the notebook session.
         * 
         * @return builder
         * 
         */
        public Builder notebookSessionUrl(@Nullable Output<String> notebookSessionUrl) {
            $.notebookSessionUrl = notebookSessionUrl;
            return this;
        }

        /**
         * @param notebookSessionUrl The URL to interact with the notebook session.
         * 
         * @return builder
         * 
         */
        public Builder notebookSessionUrl(String notebookSessionUrl) {
            return notebookSessionUrl(Output.of(notebookSessionUrl));
        }

        /**
         * @param projectId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project to associate with the notebook session.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project to associate with the notebook session.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param state The state of the notebook session.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state of the notebook session.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param timeCreated The date and time the resource was created in the timestamp format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Example: 2019-08-25T21:10:29.41Z
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(@Nullable Output<String> timeCreated) {
            $.timeCreated = timeCreated;
            return this;
        }

        /**
         * @param timeCreated The date and time the resource was created in the timestamp format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Example: 2019-08-25T21:10:29.41Z
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(String timeCreated) {
            return timeCreated(Output.of(timeCreated));
        }

        public NotebookSessionState build() {
            return $;
        }
    }

}
