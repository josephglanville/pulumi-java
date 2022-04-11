// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.storagegateway.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GatewaySmbActiveDirectorySettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewaySmbActiveDirectorySettingsArgs Empty = new GatewaySmbActiveDirectorySettingsArgs();

    @Import(name="activeDirectoryStatus")
      private final @Nullable Output<String> activeDirectoryStatus;

    public Output<String> getActiveDirectoryStatus() {
        return this.activeDirectoryStatus == null ? Codegen.empty() : this.activeDirectoryStatus;
    }

    /**
     * List of IPv4 addresses, NetBIOS names, or host names of your domain server.
     * If you need to specify the port number include it after the colon (“:”). For example, `mydc.mydomain.com:389`.
     * 
     */
    @Import(name="domainControllers")
      private final @Nullable Output<List<String>> domainControllers;

    public Output<List<String>> getDomainControllers() {
        return this.domainControllers == null ? Codegen.empty() : this.domainControllers;
    }

    /**
     * The name of the domain that you want the gateway to join.
     * 
     */
    @Import(name="domainName", required=true)
      private final Output<String> domainName;

    public Output<String> getDomainName() {
        return this.domainName;
    }

    /**
     * The organizational unit (OU) is a container in an Active Directory that can hold users, groups,
     * computers, and other OUs and this parameter specifies the OU that the gateway will join within the AD domain.
     * 
     */
    @Import(name="organizationalUnit")
      private final @Nullable Output<String> organizationalUnit;

    public Output<String> getOrganizationalUnit() {
        return this.organizationalUnit == null ? Codegen.empty() : this.organizationalUnit;
    }

    /**
     * The password of the user who has permission to add the gateway to the Active Directory domain.
     * 
     */
    @Import(name="password", required=true)
      private final Output<String> password;

    public Output<String> getPassword() {
        return this.password;
    }

    /**
     * Specifies the time in seconds, in which the JoinDomain operation must complete. The default is `20` seconds.
     * 
     */
    @Import(name="timeoutInSeconds")
      private final @Nullable Output<Integer> timeoutInSeconds;

    public Output<Integer> getTimeoutInSeconds() {
        return this.timeoutInSeconds == null ? Codegen.empty() : this.timeoutInSeconds;
    }

    /**
     * The user name of user who has permission to add the gateway to the Active Directory domain.
     * 
     */
    @Import(name="username", required=true)
      private final Output<String> username;

    public Output<String> getUsername() {
        return this.username;
    }

    public GatewaySmbActiveDirectorySettingsArgs(
        @Nullable Output<String> activeDirectoryStatus,
        @Nullable Output<List<String>> domainControllers,
        Output<String> domainName,
        @Nullable Output<String> organizationalUnit,
        Output<String> password,
        @Nullable Output<Integer> timeoutInSeconds,
        Output<String> username) {
        this.activeDirectoryStatus = activeDirectoryStatus;
        this.domainControllers = domainControllers;
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.organizationalUnit = organizationalUnit;
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.timeoutInSeconds = timeoutInSeconds;
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private GatewaySmbActiveDirectorySettingsArgs() {
        this.activeDirectoryStatus = Codegen.empty();
        this.domainControllers = Codegen.empty();
        this.domainName = Codegen.empty();
        this.organizationalUnit = Codegen.empty();
        this.password = Codegen.empty();
        this.timeoutInSeconds = Codegen.empty();
        this.username = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewaySmbActiveDirectorySettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> activeDirectoryStatus;
        private @Nullable Output<List<String>> domainControllers;
        private Output<String> domainName;
        private @Nullable Output<String> organizationalUnit;
        private Output<String> password;
        private @Nullable Output<Integer> timeoutInSeconds;
        private Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewaySmbActiveDirectorySettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDirectoryStatus = defaults.activeDirectoryStatus;
    	      this.domainControllers = defaults.domainControllers;
    	      this.domainName = defaults.domainName;
    	      this.organizationalUnit = defaults.organizationalUnit;
    	      this.password = defaults.password;
    	      this.timeoutInSeconds = defaults.timeoutInSeconds;
    	      this.username = defaults.username;
        }

        public Builder activeDirectoryStatus(@Nullable Output<String> activeDirectoryStatus) {
            this.activeDirectoryStatus = activeDirectoryStatus;
            return this;
        }
        public Builder activeDirectoryStatus(@Nullable String activeDirectoryStatus) {
            this.activeDirectoryStatus = Codegen.ofNullable(activeDirectoryStatus);
            return this;
        }
        public Builder domainControllers(@Nullable Output<List<String>> domainControllers) {
            this.domainControllers = domainControllers;
            return this;
        }
        public Builder domainControllers(@Nullable List<String> domainControllers) {
            this.domainControllers = Codegen.ofNullable(domainControllers);
            return this;
        }
        public Builder domainControllers(String... domainControllers) {
            return domainControllers(List.of(domainControllers));
        }
        public Builder domainName(Output<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        public Builder domainName(String domainName) {
            this.domainName = Output.of(Objects.requireNonNull(domainName));
            return this;
        }
        public Builder organizationalUnit(@Nullable Output<String> organizationalUnit) {
            this.organizationalUnit = organizationalUnit;
            return this;
        }
        public Builder organizationalUnit(@Nullable String organizationalUnit) {
            this.organizationalUnit = Codegen.ofNullable(organizationalUnit);
            return this;
        }
        public Builder password(Output<String> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder password(String password) {
            this.password = Output.of(Objects.requireNonNull(password));
            return this;
        }
        public Builder timeoutInSeconds(@Nullable Output<Integer> timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            return this;
        }
        public Builder timeoutInSeconds(@Nullable Integer timeoutInSeconds) {
            this.timeoutInSeconds = Codegen.ofNullable(timeoutInSeconds);
            return this;
        }
        public Builder username(Output<String> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public Builder username(String username) {
            this.username = Output.of(Objects.requireNonNull(username));
            return this;
        }        public GatewaySmbActiveDirectorySettingsArgs build() {
            return new GatewaySmbActiveDirectorySettingsArgs(activeDirectoryStatus, domainControllers, domainName, organizationalUnit, password, timeoutInSeconds, username);
        }
    }
}
