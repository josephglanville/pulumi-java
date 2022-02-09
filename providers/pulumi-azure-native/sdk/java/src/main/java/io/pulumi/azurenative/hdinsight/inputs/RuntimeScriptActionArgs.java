// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuntimeScriptActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuntimeScriptActionArgs Empty = new RuntimeScriptActionArgs();

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="parameters")
    private final @Nullable Input<String> parameters;

    public Input<String> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    @InputImport(name="roles", required=true)
    private final Input<List<String>> roles;

    public Input<List<String>> getRoles() {
        return this.roles;
    }

    @InputImport(name="uri", required=true)
    private final Input<String> uri;

    public Input<String> getUri() {
        return this.uri;
    }

    public RuntimeScriptActionArgs(
        Input<String> name,
        @Nullable Input<String> parameters,
        Input<List<String>> roles,
        Input<String> uri) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = parameters;
        this.roles = Objects.requireNonNull(roles, "expected parameter 'roles' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private RuntimeScriptActionArgs() {
        this.name = Input.empty();
        this.parameters = Input.empty();
        this.roles = Input.empty();
        this.uri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeScriptActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private @Nullable Input<String> parameters;
        private Input<List<String>> roles;
        private Input<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeScriptActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.roles = defaults.roles;
    	      this.uri = defaults.uri;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setParameters(@Nullable Input<String> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable String parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setRoles(Input<List<String>> roles) {
            this.roles = Objects.requireNonNull(roles);
            return this;
        }

        public Builder setRoles(List<String> roles) {
            this.roles = Input.of(Objects.requireNonNull(roles));
            return this;
        }

        public Builder setUri(Input<String> uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Input.of(Objects.requireNonNull(uri));
            return this;
        }

        public RuntimeScriptActionArgs build() {
            return new RuntimeScriptActionArgs(name, parameters, roles, uri);
        }
    }
}
