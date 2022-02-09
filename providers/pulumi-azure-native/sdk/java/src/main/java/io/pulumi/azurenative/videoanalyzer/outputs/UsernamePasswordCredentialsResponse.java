// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class UsernamePasswordCredentialsResponse {
    private final String password;
    private final String type;
    private final String username;

    @OutputCustomType.Constructor({"password","type","username"})
    private UsernamePasswordCredentialsResponse(
        String password,
        String type,
        String username) {
        this.password = Objects.requireNonNull(password);
        this.type = Objects.requireNonNull(type);
        this.username = Objects.requireNonNull(username);
    }

    public String getPassword() {
        return this.password;
    }
    public String getType() {
        return this.type;
    }
    public String getUsername() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UsernamePasswordCredentialsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String password;
        private String type;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(UsernamePasswordCredentialsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.type = defaults.type;
    	      this.username = defaults.username;
        }

        public Builder setPassword(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public UsernamePasswordCredentialsResponse build() {
            return new UsernamePasswordCredentialsResponse(password, type, username);
        }
    }
}
