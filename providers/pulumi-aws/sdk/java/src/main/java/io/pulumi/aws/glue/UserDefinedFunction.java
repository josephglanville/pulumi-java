// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.glue.UserDefinedFunctionArgs;
import io.pulumi.aws.glue.inputs.UserDefinedFunctionState;
import io.pulumi.aws.glue.outputs.UserDefinedFunctionResourceUri;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a Glue User Defined Function Resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Glue User Defined Functions can be imported using the `catalog_id:database_name:function_name`. If you have not set a Catalog ID specify the AWS Account ID that the database is in, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:glue/userDefinedFunction:UserDefinedFunction func 123456789012:my_database:my_func
 * ```
 * 
 */
@ResourceType(type="aws:glue/userDefinedFunction:UserDefinedFunction")
public class UserDefinedFunction extends io.pulumi.resources.CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * ID of the Glue Catalog to create the function in. If omitted, this defaults to the AWS Account ID.
     * 
     */
    @Export(name="catalogId", type=String.class, parameters={})
    private Output</* @Nullable */ String> catalogId;

    /**
     * @return ID of the Glue Catalog to create the function in. If omitted, this defaults to the AWS Account ID.
     * 
     */
    public Output</* @Nullable */ String> getCatalogId() {
        return this.catalogId;
    }
    /**
     * The Java class that contains the function code.
     * 
     */
    @Export(name="className", type=String.class, parameters={})
    private Output<String> className;

    /**
     * @return The Java class that contains the function code.
     * 
     */
    public Output<String> getClassName() {
        return this.className;
    }
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The name of the Database to create the Function.
     * 
     */
    @Export(name="databaseName", type=String.class, parameters={})
    private Output<String> databaseName;

    /**
     * @return The name of the Database to create the Function.
     * 
     */
    public Output<String> getDatabaseName() {
        return this.databaseName;
    }
    /**
     * The name of the function.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the function.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The owner of the function.
     * 
     */
    @Export(name="ownerName", type=String.class, parameters={})
    private Output<String> ownerName;

    /**
     * @return The owner of the function.
     * 
     */
    public Output<String> getOwnerName() {
        return this.ownerName;
    }
    /**
     * The owner type. can be one of `USER`, `ROLE`, and `GROUP`.
     * 
     */
    @Export(name="ownerType", type=String.class, parameters={})
    private Output<String> ownerType;

    /**
     * @return The owner type. can be one of `USER`, `ROLE`, and `GROUP`.
     * 
     */
    public Output<String> getOwnerType() {
        return this.ownerType;
    }
    /**
     * The configuration block for Resource URIs. See resource uris below for more details.
     * 
     */
    @Export(name="resourceUris", type=List.class, parameters={UserDefinedFunctionResourceUri.class})
    private Output</* @Nullable */ List<UserDefinedFunctionResourceUri>> resourceUris;

    /**
     * @return The configuration block for Resource URIs. See resource uris below for more details.
     * 
     */
    public Output</* @Nullable */ List<UserDefinedFunctionResourceUri>> getResourceUris() {
        return this.resourceUris;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserDefinedFunction(String name) {
        this(name, UserDefinedFunctionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserDefinedFunction(String name, UserDefinedFunctionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserDefinedFunction(String name, UserDefinedFunctionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:glue/userDefinedFunction:UserDefinedFunction", name, args == null ? UserDefinedFunctionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private UserDefinedFunction(String name, Output<String> id, @Nullable UserDefinedFunctionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:glue/userDefinedFunction:UserDefinedFunction", name, state, makeResourceOptions(options, id));
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
    public static UserDefinedFunction get(String name, Output<String> id, @Nullable UserDefinedFunctionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new UserDefinedFunction(name, id, state, options);
    }
}