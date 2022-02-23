// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iotsitewise.ProjectArgs;
import io.pulumi.awsnative.iotsitewise.outputs.ProjectTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::IoTSiteWise::Project
 * 
 */
@ResourceType(type="aws-native:iotsitewise:Project")
public class Project extends io.pulumi.resources.CustomResource {
    /**
     * The IDs of the assets to be associated to the project.
     * 
     */
    @OutputExport(name="assetIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> assetIds;

    /**
     * @return The IDs of the assets to be associated to the project.
     * 
     */
    public Output</* @Nullable */ List<String>> getAssetIds() {
        return this.assetIds;
    }
    /**
     * The ID of the portal in which to create the project.
     * 
     */
    @OutputExport(name="portalId", type=String.class, parameters={})
    private Output<String> portalId;

    /**
     * @return The ID of the portal in which to create the project.
     * 
     */
    public Output<String> getPortalId() {
        return this.portalId;
    }
    /**
     * The ARN of the project.
     * 
     */
    @OutputExport(name="projectArn", type=String.class, parameters={})
    private Output<String> projectArn;

    /**
     * @return The ARN of the project.
     * 
     */
    public Output<String> getProjectArn() {
        return this.projectArn;
    }
    /**
     * A description for the project.
     * 
     */
    @OutputExport(name="projectDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> projectDescription;

    /**
     * @return A description for the project.
     * 
     */
    public Output</* @Nullable */ String> getProjectDescription() {
        return this.projectDescription;
    }
    /**
     * The ID of the project.
     * 
     */
    @OutputExport(name="projectId", type=String.class, parameters={})
    private Output<String> projectId;

    /**
     * @return The ID of the project.
     * 
     */
    public Output<String> getProjectId() {
        return this.projectId;
    }
    /**
     * A friendly name for the project.
     * 
     */
    @OutputExport(name="projectName", type=String.class, parameters={})
    private Output<String> projectName;

    /**
     * @return A friendly name for the project.
     * 
     */
    public Output<String> getProjectName() {
        return this.projectName;
    }
    /**
     * A list of key-value pairs that contain metadata for the project.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={ProjectTag.class})
    private Output</* @Nullable */ List<ProjectTag>> tags;

    /**
     * @return A list of key-value pairs that contain metadata for the project.
     * 
     */
    public Output</* @Nullable */ List<ProjectTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Project(String name) {
        this(name, ProjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Project(String name, ProjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Project(String name, ProjectArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotsitewise:Project", name, args == null ? ProjectArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Project(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotsitewise:Project", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Project get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Project(name, id, options);
    }
}
