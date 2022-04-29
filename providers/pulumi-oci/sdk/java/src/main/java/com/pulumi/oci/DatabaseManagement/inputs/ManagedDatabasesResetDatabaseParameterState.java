// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseManagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DatabaseManagement.inputs.ManagedDatabasesResetDatabaseParameterCredentialsArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedDatabasesResetDatabaseParameterState extends com.pulumi.resources.ResourceArgs {

    public static final ManagedDatabasesResetDatabaseParameterState Empty = new ManagedDatabasesResetDatabaseParameterState();

    /**
     * The database credentials used to perform management activity.
     * 
     */
    @Import(name="credentials")
    private @Nullable Output<ManagedDatabasesResetDatabaseParameterCredentialsArgs> credentials;

    /**
     * @return The database credentials used to perform management activity.
     * 
     */
    public Optional<Output<ManagedDatabasesResetDatabaseParameterCredentialsArgs>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database.
     * 
     */
    @Import(name="managedDatabaseId")
    private @Nullable Output<String> managedDatabaseId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database.
     * 
     */
    public Optional<Output<String>> managedDatabaseId() {
        return Optional.ofNullable(this.managedDatabaseId);
    }

    /**
     * A list of database parameter names.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<List<String>> parameters;

    /**
     * @return A list of database parameter names.
     * 
     */
    public Optional<Output<List<String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The clause used to specify when the parameter change takes effect.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return The clause used to specify when the parameter change takes effect.
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    private ManagedDatabasesResetDatabaseParameterState() {}

    private ManagedDatabasesResetDatabaseParameterState(ManagedDatabasesResetDatabaseParameterState $) {
        this.credentials = $.credentials;
        this.managedDatabaseId = $.managedDatabaseId;
        this.parameters = $.parameters;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedDatabasesResetDatabaseParameterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedDatabasesResetDatabaseParameterState $;

        public Builder() {
            $ = new ManagedDatabasesResetDatabaseParameterState();
        }

        public Builder(ManagedDatabasesResetDatabaseParameterState defaults) {
            $ = new ManagedDatabasesResetDatabaseParameterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param credentials The database credentials used to perform management activity.
         * 
         * @return builder
         * 
         */
        public Builder credentials(@Nullable Output<ManagedDatabasesResetDatabaseParameterCredentialsArgs> credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param credentials The database credentials used to perform management activity.
         * 
         * @return builder
         * 
         */
        public Builder credentials(ManagedDatabasesResetDatabaseParameterCredentialsArgs credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @param managedDatabaseId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder managedDatabaseId(@Nullable Output<String> managedDatabaseId) {
            $.managedDatabaseId = managedDatabaseId;
            return this;
        }

        /**
         * @param managedDatabaseId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder managedDatabaseId(String managedDatabaseId) {
            return managedDatabaseId(Output.of(managedDatabaseId));
        }

        /**
         * @param parameters A list of database parameter names.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<List<String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters A list of database parameter names.
         * 
         * @return builder
         * 
         */
        public Builder parameters(List<String> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param parameters A list of database parameter names.
         * 
         * @return builder
         * 
         */
        public Builder parameters(String... parameters) {
            return parameters(List.of(parameters));
        }

        /**
         * @param scope The clause used to specify when the parameter change takes effect.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The clause used to specify when the parameter change takes effect.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public ManagedDatabasesResetDatabaseParameterState build() {
            return $;
        }
    }

}
