// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.storage.BucketAccessControlArgs;
import io.pulumi.gcp.storage.inputs.BucketAccessControlState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Bucket ACLs can be managed authoritatively using the
 * `storage_bucket_acl` resource. Do not use these two resources in conjunction to manage the same bucket.
 * 
 * The BucketAccessControls resource manages the Access Control List
 * (ACLs) for a single entity/role pairing on a bucket. ACLs let you specify who
 * has access to your data and to what extent.
 * 
 * There are three roles that can be assigned to an entity:
 * 
 * READERs can get the bucket, though no acl property will be returned, and
 * list the bucket's objects.  WRITERs are READERs, and they can insert
 * objects into the bucket and delete the bucket's objects.  OWNERs are
 * WRITERs, and they can get the acl property of a bucket, update a bucket,
 * and call all BucketAccessControls methods on the bucket.  For more
 * information, see Access Control, with the caveat that this API uses
 * READER, WRITER, and OWNER instead of READ, WRITE, and FULL_CONTROL.
 * 
 * To get more information about BucketAccessControl, see:
 * 
 * * [API documentation](https://cloud.google.com/storage/docs/json_api/v1/bucketAccessControls)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/storage/docs/access-control/lists)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * BucketAccessControl can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:storage/bucketAccessControl:BucketAccessControl default {{bucket}}/{{entity}}
 * ```
 * 
 */
@ResourceType(type="gcp:storage/bucketAccessControl:BucketAccessControl")
public class BucketAccessControl extends io.pulumi.resources.CustomResource {
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
     * user-userId
     * user-email
     * group-groupId
     * group-email
     * domain-domain
     * project-team-projectId
     * allUsers
     * allAuthenticatedUsers
     * Examples:
     * The user liz@example.com would be user-liz@example.com.
     * The group example@googlegroups.com would be
     * group-example@googlegroups.com.
     * To refer to all members of the Google Apps for Business domain
     * example.com, the entity would be domain-example.com.
     * 
     */
    @Export(name="entity", type=String.class, parameters={})
    private Output<String> entity;

    /**
     * @return The entity holding the permission, in one of the following forms:
     * user-userId
     * user-email
     * group-groupId
     * group-email
     * domain-domain
     * project-team-projectId
     * allUsers
     * allAuthenticatedUsers
     * Examples:
     * The user liz@example.com would be user-liz@example.com.
     * The group example@googlegroups.com would be
     * group-example@googlegroups.com.
     * To refer to all members of the Google Apps for Business domain
     * example.com, the entity would be domain-example.com.
     * 
     */
    public Output<String> getEntity() {
        return this.entity;
    }
    /**
     * The access permission for the entity.
     * Possible values are `OWNER`, `READER`, and `WRITER`.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output</* @Nullable */ String> role;

    /**
     * @return The access permission for the entity.
     * Possible values are `OWNER`, `READER`, and `WRITER`.
     * 
     */
    public Output</* @Nullable */ String> getRole() {
        return this.role;
    }

    public interface BuilderApplicator {
        public void apply(BucketAccessControlArgs.Builder a);
    }
    private static io.pulumi.gcp.storage.BucketAccessControlArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.storage.BucketAccessControlArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public BucketAccessControl(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BucketAccessControl(String name) {
        this(name, BucketAccessControlArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BucketAccessControl(String name, BucketAccessControlArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BucketAccessControl(String name, BucketAccessControlArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/bucketAccessControl:BucketAccessControl", name, args == null ? BucketAccessControlArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private BucketAccessControl(String name, Output<String> id, @Nullable BucketAccessControlState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/bucketAccessControl:BucketAccessControl", name, state, makeResourceOptions(options, id));
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
    public static BucketAccessControl get(String name, Output<String> id, @Nullable BucketAccessControlState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BucketAccessControl(name, id, state, options);
    }
}
