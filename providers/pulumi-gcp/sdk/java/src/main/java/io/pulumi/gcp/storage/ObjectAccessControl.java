// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.storage.ObjectAccessControlArgs;
import io.pulumi.gcp.storage.inputs.ObjectAccessControlState;
import io.pulumi.gcp.storage.outputs.ObjectAccessControlProjectTeam;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The ObjectAccessControls resources represent the Access Control Lists
 * (ACLs) for objects within Google Cloud Storage. ACLs let you specify
 * who has access to your data and to what extent.
 * 
 * There are two roles that can be assigned to an entity:
 * 
 * READERs can get an object, though the acl property will not be revealed.
 * OWNERs are READERs, and they can get the acl property, update an object,
 * and call all objectAccessControls methods on the object. The owner of an
 * object is always an OWNER.
 * For more information, see Access Control, with the caveat that this API
 * uses READER and OWNER instead of READ and FULL_CONTROL.
 * 
 * To get more information about ObjectAccessControl, see:
 * 
 * * [API documentation](https://cloud.google.com/storage/docs/json_api/v1/objectAccessControls)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/storage/docs/access-control/create-manage-lists)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * ObjectAccessControl can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:storage/objectAccessControl:ObjectAccessControl default {{bucket}}/{{object}}/{{entity}}
 * ```
 * 
 */
@ResourceType(type="gcp:storage/objectAccessControl:ObjectAccessControl")
public class ObjectAccessControl extends io.pulumi.resources.CustomResource {
    /**
     * The name of the bucket.
     * 
     */
    @Export(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    /**
     * @return The name of the bucket.
     * 
     */
    public Output<String> getBucket() {
        return this.bucket;
    }
    /**
     * The domain associated with the entity.
     * 
     */
    @Export(name="domain", type=String.class, parameters={})
    private Output<String> domain;

    /**
     * @return The domain associated with the entity.
     * 
     */
    public Output<String> getDomain() {
        return this.domain;
    }
    /**
     * The email address associated with the entity.
     * 
     */
    @Export(name="email", type=String.class, parameters={})
    private Output<String> email;

    /**
     * @return The email address associated with the entity.
     * 
     */
    public Output<String> getEmail() {
        return this.email;
    }
    /**
     * The entity holding the permission, in one of the following forms:
     * * user-{{userId}}
     * * user-{{email}} (such as "user-liz@example.com")
     * * group-{{groupId}}
     * * group-{{email}} (such as "group-example@googlegroups.com")
     * * domain-{{domain}} (such as "domain-example.com")
     * * project-team-{{projectId}}
     * * allUsers
     * * allAuthenticatedUsers
     * 
     */
    @Export(name="entity", type=String.class, parameters={})
    private Output<String> entity;

    /**
     * @return The entity holding the permission, in one of the following forms:
     * * user-{{userId}}
     * * user-{{email}} (such as "user-liz@example.com")
     * * group-{{groupId}}
     * * group-{{email}} (such as "group-example@googlegroups.com")
     * * domain-{{domain}} (such as "domain-example.com")
     * * project-team-{{projectId}}
     * * allUsers
     * * allAuthenticatedUsers
     * 
     */
    public Output<String> getEntity() {
        return this.entity;
    }
    /**
     * The ID for the entity
     * 
     */
    @Export(name="entityId", type=String.class, parameters={})
    private Output<String> entityId;

    /**
     * @return The ID for the entity
     * 
     */
    public Output<String> getEntityId() {
        return this.entityId;
    }
    /**
     * The content generation of the object, if applied to an object.
     * 
     */
    @Export(name="generation", type=Integer.class, parameters={})
    private Output<Integer> generation;

    /**
     * @return The content generation of the object, if applied to an object.
     * 
     */
    public Output<Integer> getGeneration() {
        return this.generation;
    }
    /**
     * The name of the object to apply the access control to.
     * 
     */
    @Export(name="object", type=String.class, parameters={})
    private Output<String> object;

    /**
     * @return The name of the object to apply the access control to.
     * 
     */
    public Output<String> getObject() {
        return this.object;
    }
    /**
     * The project team associated with the entity
     * 
     */
    @Export(name="projectTeams", type=List.class, parameters={ObjectAccessControlProjectTeam.class})
    private Output<List<ObjectAccessControlProjectTeam>> projectTeams;

    /**
     * @return The project team associated with the entity
     * 
     */
    public Output<List<ObjectAccessControlProjectTeam>> getProjectTeams() {
        return this.projectTeams;
    }
    /**
     * The access permission for the entity.
     * Possible values are `OWNER` and `READER`.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The access permission for the entity.
     * Possible values are `OWNER` and `READER`.
     * 
     */
    public Output<String> getRole() {
        return this.role;
    }

    public interface BuilderApplicator {
        public void apply(ObjectAccessControlArgs.Builder a);
    }
    private static io.pulumi.gcp.storage.ObjectAccessControlArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.storage.ObjectAccessControlArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ObjectAccessControl(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ObjectAccessControl(String name) {
        this(name, ObjectAccessControlArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ObjectAccessControl(String name, ObjectAccessControlArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ObjectAccessControl(String name, ObjectAccessControlArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/objectAccessControl:ObjectAccessControl", name, args == null ? ObjectAccessControlArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ObjectAccessControl(String name, Output<String> id, @Nullable ObjectAccessControlState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/objectAccessControl:ObjectAccessControl", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ObjectAccessControl get(String name, Output<String> id, @Nullable ObjectAccessControlState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ObjectAccessControl(name, id, state, options);
    }
}
